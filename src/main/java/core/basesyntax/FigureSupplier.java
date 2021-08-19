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
        return new IsoscelesTrapezoid(
                random.nextInt(RANDOM_RANGE),
                random.nextInt(RANDOM_RANGE),
                random.nextInt(RANDOM_RANGE));
    }

    private Circle circle() {
        return new Circle(random.nextInt(RANDOM_RANGE));
    }

    private RightTriangle rightTriangle() {
        return new RightTriangle(
                random.nextInt(RANDOM_RANGE),
                random.nextInt(RANDOM_RANGE));
    }

    private Rectangle rectangle() {
        return new Rectangle(random.nextInt(RANDOM_RANGE),
                random.nextInt(RANDOM_RANGE));
    }

    private Square square() {
        return new Square(random.nextInt(RANDOM_RANGE));
    }
}
