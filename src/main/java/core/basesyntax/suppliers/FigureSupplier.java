package core.basesyntax.suppliers;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_NUMBER = 30;
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Color defaultColor = Color.WHITE;

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, DEFAULT_RADIUS);
    }

    public int getRandomSize() {
        return random.nextInt(MAX_NUMBER);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        switch (index) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),getRandomSize());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),getRandomSize(),
                        getRandomSize(),getRandomSize());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomSize(),getRandomSize());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomSize());
            case 4:
                return new Circle(colorSupplier.getRandomColor(),getRandomSize());
            default:
                return getDefaultFigure();
        }
    }
}
