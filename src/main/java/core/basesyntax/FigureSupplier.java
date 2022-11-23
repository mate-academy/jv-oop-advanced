package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_LENGTH = 50;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int FIGURE_NUMBER = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private Square getRandomSquare() {
        Square square = new Square(random.nextInt(MAX_LENGTH), colorSupplier.getRandomColor());
        return square;
    }

    private Circle getRandomCircle() {
        Circle circle = new Circle(random.nextInt(MAX_LENGTH), colorSupplier.getRandomColor());
        return circle;
    }

    private IsoscelesTrapezoid getRandomTrapezoid() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(random.nextInt(MAX_LENGTH),
                random.nextInt(MAX_LENGTH), random.nextInt(MAX_LENGTH),
                colorSupplier.getRandomColor());
        return trapezoid;
    }

    private Rectangle getRandomRectangle() {
        Rectangle rectangle = new Rectangle(random.nextInt(MAX_LENGTH),
                random.nextInt(MAX_LENGTH), colorSupplier.getRandomColor());
        return rectangle;
    }

    private RightTriangle getRandomTriangle() {
        RightTriangle triangle = new RightTriangle(random.nextInt(MAX_LENGTH),
                random.nextInt(MAX_LENGTH), colorSupplier.getRandomColor());
        return triangle;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        int number = random.nextInt(FIGURE_NUMBER);
        switch (number) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomTriangle();
            default:
                return getRandomTrapezoid();
        }
    }
}
