package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_NUM = 10;
    private static final int MAX_UNITS = 20;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(Color.values().length);
        switch (randomNumber) {
            case 0:
                return getSquare();
            case 1:
                return getRectangle();
            case 2:
                return getTriangle();
            case 3:
                return getCircle();
            default:
                return getTrapezoid();
        }
    }

    private Square getSquare() {
        double randomSide = random.nextInt(MAX_UNITS) + 1;
        String randomSquareColor = colorSupplier.getRandomColor();
        return new Square(randomSide, randomSquareColor);
    }

    private Rectangle getRectangle() {
        double randomHeight = random.nextInt(MAX_UNITS) + 1;
        double randomWidth = random.nextInt(MAX_UNITS) + 1;
        String randomRectangleColor = colorSupplier.getRandomColor();
        return new Rectangle(randomHeight, randomWidth, randomRectangleColor);
    }

    private RightTriangle getTriangle() {
        double randomFirstLeg = random.nextInt(MAX_UNITS) + 1;
        double randomSecondLeg = random.nextInt(MAX_UNITS) + 1;
        String randomTriangleColor = colorSupplier.getRandomColor();
        return new RightTriangle(randomFirstLeg, randomSecondLeg, randomTriangleColor);
    }

    private Circle getCircle() {
        double randomRadius = random.nextInt(MAX_UNITS) + 1;
        String randomCircleColor = colorSupplier.getRandomColor();
        return new Circle(randomRadius, randomCircleColor);
    }

    private IsoscelesTrapezoid getTrapezoid() {
        double randomTrHeight = random.nextInt(MAX_UNITS) + 1;
        double randomTop = random.nextInt(MAX_UNITS) + 1;
        double randomBottom = random.nextInt(MAX_UNITS) + 1;
        String randomTrColor = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(randomTrHeight, randomTop, randomBottom, randomTrColor);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_NUM, Color.WHITE.name());
    }
}
