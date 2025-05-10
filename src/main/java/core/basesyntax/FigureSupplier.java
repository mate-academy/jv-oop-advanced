package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Locale;
import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_RADIUS = 10;
    public static final int MAX_VALUE_OF_PARAMETER = 25;
    public static final int NUMBER_OF_FIGURES = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        switch (index) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_OF_PARAMETER));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_OF_PARAMETER),
                        random.nextInt(MAX_VALUE_OF_PARAMETER),
                        random.nextInt(MAX_VALUE_OF_PARAMETER));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_OF_PARAMETER),
                        random.nextInt(MAX_VALUE_OF_PARAMETER));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_OF_PARAMETER),
                        random.nextInt(MAX_VALUE_OF_PARAMETER));
            default:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE_OF_PARAMETER));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(Locale.ROOT), DEFAULT_RADIUS);
    }
}
