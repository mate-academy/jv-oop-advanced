package core.basesyntax.supplier;

import core.basesyntax.enums.Color;
import core.basesyntax.figure.*;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBERS_OF_FIGURES = 4;
    private static final int DEFAULT_RADIUS_FOR_CIRCLE = 10;
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
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS_FOR_CIRCLE);
    }
}
