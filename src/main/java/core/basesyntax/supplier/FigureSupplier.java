package core.basesyntax.supplier;

import core.basesyntax.enums.Color;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBERS_OF_FIGURES = 4;
    private static final int DEFAULT_RADIUS_FOR_CIRCLE = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private final Random random = new Random();

    public Figure getRandomFigure() {
        int type = random.nextInt(NUMBERS_OF_FIGURES);
        double areaValue = random.nextDouble();
        switch (type) {
            case 0 :
                return new Rectangle(colorSupplier.getRandomColor(), areaValue, areaValue);
            case 1 :
                return new Square(colorSupplier.getRandomColor(), areaValue);
            case 2 :
                return new RightTriangle(colorSupplier.getRandomColor(), areaValue, areaValue);
            case 3 :
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), areaValue, areaValue);
            default:
                return new Circle(colorSupplier.getRandomColor(), areaValue);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS_FOR_CIRCLE);
    }
}
