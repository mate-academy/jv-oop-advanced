package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;

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
            default:
                return getRandomIsoscelesTrapezoidObject();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    public Figure getRandomCircleObject() {
        Color color = new ColorSupplier().getRandomColor();
        int randomLength = new Random().nextInt(20);
        return new Circle(color, randomLength);
    }

    public Figure getRandomIsoscelesTrapezoidObject() {
        Color color = new ColorSupplier().getRandomColor();
        int randomLength = new Random().nextInt(20);
        return new IsoscelesTrapezoid(color, randomLength, randomLength, randomLength);
    }

    public Figure getRandomRectangleObject() {
        Color color = new ColorSupplier().getRandomColor();
        int randomLength = new Random().nextInt(20);
        return new Rectangle(color, randomLength, randomLength);
    }

    public Figure getRandomRightTriangleObject() {
        Color color = new ColorSupplier().getRandomColor();
        int randomLength = new Random().nextInt(20);
        return new RightTriangle(color, randomLength, randomLength);
    }

    public Figure getRandomSquareObject() {
        Color color = new ColorSupplier().getRandomColor();
        int randomLength = new Random().nextInt(20);
        return new Square(color, randomLength);
    }
}
