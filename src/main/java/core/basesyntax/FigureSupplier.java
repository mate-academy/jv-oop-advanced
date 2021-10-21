package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_NUMBER = 20;

    public Figure getRandomFigure() {
        int figureNumber = new Random().nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return getRandomSquareObject();
            case 1:
                return getRandomCircleObject();
            case 2:
                return getRandomRightTriangleObject();
            case 3:
                return getRandomRectangleObject();
            case 4:
            default:
                return getRandomIsoscelesTrapezoidObject();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }

    public Figure getRandomCircleObject() {
        Color color = new ColorSupplier().getRandomColor();
        int radius = new Random().nextInt(MAX_NUMBER);
        return new Circle(color, radius);
    }

    public Figure getRandomIsoscelesTrapezoidObject() {
        Color color = new ColorSupplier().getRandomColor();
        int upperSide = new Random().nextInt(MAX_NUMBER);
        int lowerSide = new Random().nextInt(MAX_NUMBER);
        int height = new Random().nextInt(MAX_NUMBER);
        return new IsoscelesTrapezoid(color, height, upperSide, lowerSide);
    }

    public Figure getRandomRectangleObject() {
        Color color = new ColorSupplier().getRandomColor();
        int upperSide = new Random().nextInt(MAX_NUMBER);
        int lowerSide = new Random().nextInt(MAX_NUMBER);
        return new Rectangle(color, upperSide, lowerSide);
    }

    public Figure getRandomRightTriangleObject() {
        Color color = new ColorSupplier().getRandomColor();
        int height = new Random().nextInt(MAX_NUMBER);
        int side = new Random().nextInt(MAX_NUMBER);
        return new RightTriangle(color, height, side);
    }

    public Figure getRandomSquareObject() {
        Color color = new ColorSupplier().getRandomColor();
        int side = new Random().nextInt(MAX_NUMBER);
        return new Square(color, side);
    }
}
