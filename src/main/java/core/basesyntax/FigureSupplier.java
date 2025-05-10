package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int RANDOM_VALUE = 20;
    private static final Random RANDOM = new Random();

    public Figure getRandomFigure() {
        int randomNumber = RANDOM.nextInt(FIGURE_COUNT);
        switch (randomNumber) {
            case 0: return createCircle();
            case 1: return createIsoscelesTrapezoid();
            case 2: return createRectangle();
            case 3: return createRightTriangle();
            default: return createSquare();
        }
    }

    private Figure createCircle() {
        int radius = RANDOM.nextInt(RANDOM_VALUE);
        return new Circle(radius);
    }

    private Figure createIsoscelesTrapezoid() {
        int upSide = RANDOM.nextInt(RANDOM_VALUE);
        int downSide = RANDOM.nextInt(RANDOM_VALUE);
        int lateralSides = RANDOM.nextInt(RANDOM_VALUE);
        return new IsoscelesTrapezoid(upSide, downSide, lateralSides);
    }

    private Figure createRectangle() {
        int firstLeg = RANDOM.nextInt(RANDOM_VALUE);
        int secondLeg = RANDOM.nextInt(RANDOM_VALUE);
        return new Rectangle(firstLeg, secondLeg);
    }

    private Figure createRightTriangle() {
        int side = RANDOM.nextInt(RANDOM_VALUE);
        return new RightTriangle(side);
    }

    private Figure createSquare() {
        int side = RANDOM.nextInt(RANDOM_VALUE);
        return new Square(side);
    }
}
