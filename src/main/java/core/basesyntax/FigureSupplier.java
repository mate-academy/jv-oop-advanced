package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private static final int FIGURE_COUNT = 5;

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case (0):
                return getRandomCircle();
            case (1):
                return getRandomSquare();
            case (2):
                return getRandomRectangle();
            case (3):
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor("WHITE");
        return circle;
    }

    private Rectangle getRandomRectangle() {
        Rectangle rectangle = new Rectangle(random.nextInt(10), random.nextInt(10));
        return rectangle;
    }

    private Circle getRandomCircle() {
        Circle circle = new Circle(random.nextInt(10));
        return circle;
    }

    private Square getRandomSquare() {
        Square square = new Square(random.nextInt(10));
        return square;
    }

    private RightTriangle getRandomRightTriangle() {
        RightTriangle triangle = new RightTriangle(random.nextInt(10), random.nextInt(10));
        return triangle;
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(random.nextInt(10),
                random.nextInt(10),random.nextInt(10));
        return trapezoid;
    }
}
