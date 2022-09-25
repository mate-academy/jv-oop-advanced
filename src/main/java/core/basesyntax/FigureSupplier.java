package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int RANDOM_RANGE = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private Circle getRandomCircle() {
        int radius = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
        return new Circle(colorSupplier.getRandomColor(), radius);
    }

    private Square getRandomSquare() {
        int side = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
        return new Square(colorSupplier.getRandomColor(), side);
    }

    private Rectangle getRandomRectangle() {
        int sideA = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
        int sideB = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
        return new Rectangle(colorSupplier.getRandomColor(), sideA, sideB);
    }

    private RightTriangle getRandomRightTriangle() {
        int firstLeg = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
        int secondLeg = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
        return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int legs = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
        int upperSide = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
        int lowerSide = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                legs, upperSide, lowerSide);
    }

    public Figure getRandomFigure() {
        int randomFig = random.nextInt(RANDOM_RANGE);
        switch (randomFig) {
            case 1 :
                return getRandomCircle();
            case 2 :
                return getRandomRectangle();
            case 3 :
                return getRandomRightTriangle();
            case 4 :
                return getRandomIsoscelesTrapezoid();
            case 5 :
            default :
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }
}
