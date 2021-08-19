package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int RANDOM_RANGE = 100;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return isoscelesTrapezoid();
            case 1:
                return circle();
            case 2:
                return rightTriangle();
            case 3:
                return rectangle();
            default:
                return square();
        }
    }

    private IsoscelesTrapezoid isoscelesTrapezoid() {
        int smallBase = random.nextInt(RANDOM_RANGE);
        int bigBase = random.nextInt(RANDOM_RANGE);
        int height = random.nextInt(RANDOM_RANGE);
        return new IsoscelesTrapezoid(smallBase, bigBase, height);
    }

    private Circle circle() {
        int radius = random.nextInt(RANDOM_RANGE);
        return new Circle(radius);
    }

    private RightTriangle rightTriangle() {
        int firstLeg = random.nextInt(RANDOM_RANGE);
        int secondLeg = random.nextInt(RANDOM_RANGE);
        return new RightTriangle(firstLeg, secondLeg);
    }

    private Rectangle rectangle() {
        int height = random.nextInt(RANDOM_RANGE);
        int weight = random.nextInt(RANDOM_RANGE);
        return new Rectangle(height, weight);
    }

    private Square square() {
        int side = random.nextInt(RANDOM_RANGE);
        return new Square(side);
    }
}
