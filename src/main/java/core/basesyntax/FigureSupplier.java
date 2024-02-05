package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String COLOR_WHITE = "White";
    private static final int CONST_RADIUS = 10;
    private static final int NUM = 100;
    private static final int NUM_OF_FIGURE = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();

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
        Circle defaultCircle = new Circle();
        defaultCircle.setRadius(CONST_RADIUS);
        defaultCircle.setColor(COLOR_WHITE);
        defaultCircle.countArea(defaultCircle);
        return defaultCircle;
    }

    private Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setRadius(getRandomNum());
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    private Figure getRandomSquare() {
        Square square = new Square();
        square.setSide(getRandomNum());
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }

    private Figure getRandomRightTriangle() {
        RightTriangle triangle = new RightTriangle();
        triangle.setFirstLeg(getRandomNum());
        triangle.setSecondLeg(getRandomNum());
        triangle.setColor(colorSupplier.getRandomColor());
        return triangle;
    }

    private Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setFirstSide(getRandomNum());
        rectangle.setSecondSide(getRandomNum());
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid();
        trapezoid.setUpperBaseA(getRandomNum());
        trapezoid.setLowerBaseB(getRandomNum());
        trapezoid.setLateralSideC(getRandomNum());
        trapezoid.setColor(colorSupplier.getRandomColor());
        return trapezoid;
    }

    private int getRandomNum() {
        return new Random().nextInt(NUM);
    }

    private int getRandomFigureNumber() {
        return new Random().nextInt(NUM_OF_FIGURE);
    }
}
