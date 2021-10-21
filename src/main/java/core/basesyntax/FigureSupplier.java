package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final int LENGTH_DEFAULT = 10;
    private static final int LENGTH_CONST = 20;

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
        return new Circle(Color.WHITE, LENGTH_DEFAULT);
    }

    public Figure getRandomCircleObject() {
        Color color = new ColorSupplier().getRandomColor();
        int radius = new Random().nextInt(LENGTH_CONST);
        return new Circle(color, radius);
    }

    public Figure getRandomIsoscelesTrapezoidObject() {
        Color color = new ColorSupplier().getRandomColor();
        int upperSide = new Random().nextInt(LENGTH_CONST);
        int lowerSide = new Random().nextInt(LENGTH_CONST);
        int height = new Random().nextInt(LENGTH_CONST);
        return new IsoscelesTrapezoid(color, height, upperSide, lowerSide);
    }

    public Figure getRandomRectangleObject() {
        Color color = new ColorSupplier().getRandomColor();
        int upperSide = new Random().nextInt(LENGTH_CONST);
        int lowerSide = new Random().nextInt(LENGTH_CONST);
        return new Rectangle(color, upperSide, lowerSide);
    }

    public Figure getRandomRightTriangleObject() {
        Color color = new ColorSupplier().getRandomColor();
        int height = new Random().nextInt(LENGTH_CONST);
        int side = new Random().nextInt(LENGTH_CONST);
        return new RightTriangle(color, height, side);
    }

    public Figure getRandomSquareObject() {
        Color color = new ColorSupplier().getRandomColor();
        int side = new Random().nextInt(LENGTH_CONST);
        return new Square(color, side);
    }
}
