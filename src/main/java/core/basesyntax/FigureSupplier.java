package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_VALUE = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_VALUE = 15;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public int getGeometricProperty() {
        int geometricProperty = random.nextInt(1, NUMBER_OF_FIGURES + 1);
        return geometricProperty;
    }

    public int getRandomValue() {
        int randomValue = random.nextInt(1, MAX_VALUE);
        return randomValue;
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (getGeometricProperty()) {
            case 1:
                return new Circle(color, getRandomValue());
            case 2:
                return new Rectangle(color, getRandomValue(),
                        getRandomValue());
            case 3:
                return new Square(color, getRandomValue());
            case 4:
                return new IsoscelesTrapezoid(color, getRandomValue(),
                        getRandomValue(), getRandomValue());
            default:
                return new RightTriangle(color, getRandomValue(),
                        getRandomValue());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_VALUE);
    }
}
