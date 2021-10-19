package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int MAX_SIZE = 50;
    private static final int FIGURE_COUNT = 3; //equals to figure type quantity - 1

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
            default:
                return getRandomRightTriangle();
        }
    }

    public Figure getDefaultFigure() {
        String color = Color.WHITE.toString();
        return new Circle(color, DEFAULT_CIRCLE_RADIUS);
    }

    private Circle getRandomCircle() {
        String color = new ColorSupplier().getRandomColor();
        int radius = getRandomSize();
        return new Circle(color, radius);
    }

    private IsoscelesTrapezoid getRandomTrapezoid() {
        String color = new ColorSupplier().getRandomColor();
        int baseA = getRandomSize();
        int baseB = getRandomSize();
        int leg = getRandomSize();
        return new IsoscelesTrapezoid(color, baseA, baseB, leg);
    }

    private Rectangle getRandomRectangle() {
        String color = new ColorSupplier().getRandomColor();
        int sideA = getRandomSize();
        int sideB = getRandomSize();
        return new Rectangle(color, sideA, sideB);
    }

    private RightTriangle getRandomRightTriangle() {
        String color = new ColorSupplier().getRandomColor();
        int firstLeg = getRandomSize();
        int secondLeg = getRandomSize();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Square getRandomSquare() {
        String color = new ColorSupplier().getRandomColor();
        int side = getRandomSize();
        return new Square(color, side);
    }

    private int getRandomSize() {
        return new Random().nextInt(MAX_SIZE);
    }
}
