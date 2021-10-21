package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_VALUE_OF_PARAMETR = 20;
    public static final int FIGURE_COUNT = 5;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        int randomFigure = new Random().nextInt(FIGURE_COUNT);
        switch (randomFigure) {
            case 0 : {
                int side = new Random().nextInt(MAX_VALUE_OF_PARAMETR);
                return new Square(randomColor, side);
            }
            case 1 : {
                int sideA = new Random().nextInt(MAX_VALUE_OF_PARAMETR);
                int sideB = new Random().nextInt(MAX_VALUE_OF_PARAMETR);
                return new Rectangle(randomColor, sideA, sideB);
            }
            case 2 : {
                int sideA = new Random().nextInt(MAX_VALUE_OF_PARAMETR);
                int sideB = new Random().nextInt(MAX_VALUE_OF_PARAMETR);
                return new RightTriangle(randomColor, sideA, sideB);
            }
            case 3 : {
                int radius = new Random().nextInt(MAX_VALUE_OF_PARAMETR);
                return new Circle(randomColor, radius);
            }
            default : {
                int side = new Random().nextInt(MAX_VALUE_OF_PARAMETR);
                int baseA = new Random().nextInt(MAX_VALUE_OF_PARAMETR);
                int baseB = new Random().nextInt(MAX_VALUE_OF_PARAMETR);
                return new IsoscelesTrapezoid(randomColor, side, baseA, baseB);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}
