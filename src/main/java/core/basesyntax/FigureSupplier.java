package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_10 = 10;
    private static final int NUMBER_5 = 5;
    private final Random random = new Random();
    private final ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_5);
        double sideA;
        double sideB;
        double height;
        switch (figureType) {
            case 0: // Square
                sideA = random.nextInt(NUMBER_10) + 1;
                return new Square(randomColor.getRandomColor(), sideA);
            case 1: // Rectangle
                sideA = random.nextInt(NUMBER_10) + 1;
                sideB = random.nextInt(NUMBER_10) + 1;
                return new Rectangle(randomColor.getRandomColor(), sideA, sideB);
            case 2: // Circle
                int radius = random.nextInt(NUMBER_10) + 1;
                return new Circle(randomColor.getRandomColor(), radius);
            case 3://Triangle
                sideA = random.nextInt(NUMBER_10) + 1;
                sideB = random.nextInt(NUMBER_10) + 1;
                return new RightTriangle(randomColor.getRandomColor(), sideA, sideB);
            case 4:// Trapezoid
                sideA = random.nextInt(NUMBER_10) + 1;
                sideB = random.nextInt(NUMBER_10) + 1;
                height = random.nextInt(NUMBER_10) + 1;
                return new IsoscelesTrapezoid(randomColor.getRandomColor(), sideA, sideB, height);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", NUMBER_10);
    }

}
