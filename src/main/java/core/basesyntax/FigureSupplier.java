package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random;
    private ColorSupplier colorSupplier;
    private Square square;
    private Circle circle;
    private Rectangle rectangle;
    private Triangle triangle;
    private Trapezoid trapezoid;

    private Figure getSquare() {
        square.setColor(colorSupplier.getRandomColor());
        square.setSide(random.nextInt(15) == 0 ? 5 : random.nextInt(15));
        return square;
    }

    private Figure getCircle() {
        circle.setColor(colorSupplier.getRandomColor());
        circle.setRadius(random.nextInt(7) == 0 ? 7 : random.nextInt(7));
        return circle;
    }

    private Figure getRectangle() {
        rectangle.setColor(colorSupplier.getRandomColor());
        rectangle.setHeight(random.nextInt(10) == 0 ? 5 : random.nextInt(10));
        rectangle.setWidth(random.nextInt(25) == 0 ? 10 : random.nextInt(25));
        return rectangle;
    }

    private Figure getTriangle() {
        triangle.setColor(colorSupplier.getRandomColor());
        triangle.setBase(random.nextInt(10) == 0 ? 5 : random.nextInt(10));
        triangle.setHeight(random.nextInt(25) == 0 ? 5 : random.nextInt(25));
        return triangle;
    }

    private Figure getTrapezoid() {
        trapezoid.setColor(colorSupplier.getRandomColor());
        trapezoid.setTop(random.nextInt(7) == 0 ? 3 : random.nextInt(7));
        trapezoid.setBase(random.nextInt(20) == 0 ? 5 : random.nextInt(20));
        trapezoid.setHeight(random.nextInt(25) == 0 ? 10 : random.nextInt(25));
        return trapezoid;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return getSquare();
            case 1:
                return getCircle();
            case 2:
                return getRectangle();
            case 3:
                return getTriangle();
            default:
                return getTrapezoid();
        }
    }

    public Figure getDefaultSquare() {
        square.setSide(10);
        square.setColor("red");
        return square;
    }

    public Figure getDefaultTriangle() {
        triangle.setBase(10);
        triangle.setHeight(10);
        triangle.setColor("blue");
        return triangle;
    }

    public Figure getDefaultTrapezoid() {
        trapezoid.setBase(10);
        trapezoid.setHeight(10);
        trapezoid.setTop(5);
        trapezoid.setColor("green");
        return trapezoid;
    }

    public Figure getDefaultRectangle() {
        rectangle.setHeight(5);
        rectangle.setWidth(10);
        rectangle.setColor("yellow");
        return rectangle;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("white");
        return circle;
    }
}
