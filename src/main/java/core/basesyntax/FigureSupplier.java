package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int MAX_SIZE = 50;
    private static final int FIGURE_COUNT = 4;
    private ColorSupplier colorSupplier;

    public FigureSupplier() {
        this.colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(FIGURE_COUNT);
        switch (figureIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomTrapezoid();
            case 4 :
                return getRandomRightTriangle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        String color = Color.WHITE.toString();
        return new Circle(color, DEFAULT_CIRCLE_RADIUS);
    }

    private Circle getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = getRandomSize();
        return new Circle(color, radius);
    }

    private IsoscelesTrapezoid getRandomTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int baseA = getRandomSize();
        int baseB = getRandomSize();
        int leg = getRandomSize();
        return new IsoscelesTrapezoid(color, baseA, baseB, leg);
    }

    private Rectangle getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int sideA = getRandomSize();
        int sideB = getRandomSize();
        return new Rectangle(color, sideA, sideB);
    }

    private RightTriangle getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = getRandomSize();
        int secondLeg = getRandomSize();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Square getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int side = getRandomSize();
        return new Square(color, side);
    }

    private int getRandomSize() {
        return new Random().nextInt(MAX_SIZE);
    }
}
