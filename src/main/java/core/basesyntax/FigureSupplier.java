package main.java.core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_COUNTER = 10;
    private static final int FIGURES_QUANTITY = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int i = random.nextInt(FIGURES_QUANTITY);
        switch (i) {
            case 0 :
                return circle();
            case 1:
                return isoscelesTrapezoid();
            case 2:
                return rectangle();
            case 3:
                return rightTriangle();

            default:
                return square();
        }
    }

    private Figure circle() {
        String circleColor = ColorSupplier.getRandomColor();
        int radius = random.nextInt(RANDOM_COUNTER) + 1;
        return new Circle(circleColor, radius);
    }

    private Figure isoscelesTrapezoid() {
        String isoscelesTrapezoidColor = ColorSupplier.getRandomColor();
        int baseA = random.nextInt(RANDOM_COUNTER) + 1;
        int baseB = random.nextInt(RANDOM_COUNTER) + 1;
        int height = random.nextInt(RANDOM_COUNTER) + 1;
        return new IsoscelesTrapezoid(isoscelesTrapezoidColor, baseA, baseB, height);
    }

    private Figure rectangle() {
        String rectangleColor = ColorSupplier.getRandomColor();
        int longSide = random.nextInt(RANDOM_COUNTER) + 1;
        int shortSide = random.nextInt(RANDOM_COUNTER) + 1;
        return new Rectangle(rectangleColor, longSide, shortSide);
    }

    private Figure rightTriangle() {
        String rightTriangleColor = ColorSupplier.getRandomColor();
        int firstLeg = random.nextInt(RANDOM_COUNTER) + 1;
        int secondLeg = random.nextInt(RANDOM_COUNTER) + 1;
        return new RightTriangle(rightTriangleColor, firstLeg, secondLeg);
    }

    private Figure square() {
        String squareColor = ColorSupplier.getRandomColor();
        int side = random.nextInt(RANDOM_COUNTER) + 1;
        return new Square(squareColor, side);
    }
}
