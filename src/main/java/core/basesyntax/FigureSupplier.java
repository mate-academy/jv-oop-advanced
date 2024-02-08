package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int CONST_RADIUS = 10;
    private static final int NUM = 100;
    private static final int NUM_OF_FIGURE = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        switch (getRandomFigureNumber()) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomRectangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        Circle defaultCircle = new Circle(CONST_RADIUS, Color.WHITE.name());
        defaultCircle.countArea();
        return defaultCircle;
    }

    private Figure getRandomCircle() {
        Circle circle = new Circle(getRandomNum(), colorSupplier.getRandomColor());
        return circle;
    }

    private Figure getRandomSquare() {
        Square square = new Square(getRandomNum(), colorSupplier.getRandomColor());
        return square;
    }

    private Figure getRandomRightTriangle() {
        RightTriangle triangle = new RightTriangle(getRandomNum(), getRandomNum(),
                colorSupplier.getRandomColor());
        return triangle;
    }

    private Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle(getRandomNum(), getRandomNum(),
                colorSupplier.getRandomColor());
        return rectangle;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(getRandomNum(), getRandomNum(),
                getRandomNum(), colorSupplier.getRandomColor());
        return trapezoid;
    }

    private int getRandomNum() {
        return random.nextInt(NUM);
    }

    private int getRandomFigureNumber() {
        return random.nextInt(NUM_OF_FIGURE);
    }
}
