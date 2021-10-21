package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int RANDOM_RANGE = 5;

    private Circle getRandomCircle() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int radius = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
        return new Circle(colorSupplier.getRandomColor(), radius);
    }

    private Square getRandomSquare() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int side = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
        return new Square(colorSupplier.getRandomColor(), side);
    }

    private Rectangle getRandomRectangle() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int sideA = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
        int sideB = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
        return new Rectangle(colorSupplier.getRandomColor(), sideA, sideB);
    }

    private RightTriangle getRandomRightTriangle() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int firstLeg = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
        int secondLeg = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
        return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int legs = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
        int upperSide = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
        int lowerSide = RANDOM_RANGE + random.nextInt(RANDOM_RANGE);
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                legs, upperSide, lowerSide);
    }

    public Figure getRandomFigure() {
        Random random = new Random();
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
            default :
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }
}
