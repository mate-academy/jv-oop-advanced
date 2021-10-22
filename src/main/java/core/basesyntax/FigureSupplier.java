package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE_OF_PARAMETR = 20;
    private static final int FIGURE_COUNT = 5;

    private int generateRandomValue() {
        int resultRandomValue = new Random().nextInt(MAX_VALUE_OF_PARAMETR);
        return resultRandomValue;
    }

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        int randomFigure = new Random().nextInt(FIGURE_COUNT);
        switch (randomFigure) {
            case 0 : {
                int side = generateRandomValue();
                return new Square(randomColor, side);
            }
            case 1 : {
                int sideA = generateRandomValue();
                int sideB = generateRandomValue();
                return new Rectangle(randomColor, sideA, sideB);
            }
            case 2 : {
                int sideA = generateRandomValue();
                int sideB = generateRandomValue();
                return new RightTriangle(randomColor, sideA, sideB);
            }
            case 3 : {
                int radius = generateRandomValue();
                return new Circle(randomColor, radius);
            }
            default : {
                int side = generateRandomValue();
                int baseA = generateRandomValue();
                int baseB = generateRandomValue();
                return new IsoscelesTrapezoid(randomColor, side, baseA, baseB);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
