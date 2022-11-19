package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE = 1000;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_SIDE = 10;
    private static final int SUBCLASSES_NUMBER = 5;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    private Circle getRandomCircle() {
        Circle circle = new Circle();
        circle.setColor(color.getRandomColor());
        circle.setRadius(random.nextInt(MAX_SIDE));
        return circle;
    }

    private IsoscelesTrapezoid getRandomTrapezoid() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(random.nextInt(MAX_SIDE),
                random.nextInt(MAX_SIDE), random.nextInt(MAX_SIDE));
        trapezoid.setColor(color.getRandomColor());
        return trapezoid;
    }

    private Rectangle getRandomRectangle() {
        Rectangle rectangle = new Rectangle(random.nextInt(MAX_SIDE), random.nextInt(MAX_SIDE));
        rectangle.setColor(color.getRandomColor());
        return rectangle;
    }

    private RightTriangle getRandomTriangle() {
        RightTriangle triangle = new RightTriangle(random.nextInt(MAX_SIDE),
                random.nextInt(MAX_SIDE));
        triangle.setColor(color.getRandomColor());
        return triangle;
    }

    private Square getRandomSquare() {
        Square square = new Square(random.nextInt(MAX_SIDE));
        square.setColor(color.getRandomColor());
        return square;
    }

    public Figure defaultFigure() {
        Circle defaultCircle = new Circle();
        defaultCircle.setColor(DEFAULT_COLOR);
        defaultCircle.setRadius(DEFAULT_SIDE);
        return defaultCircle;
    }

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(SUBCLASSES_NUMBER);

        switch (randomIndex) {
            case (0):
                return getRandomCircle();
            case (1):
                return getRandomTrapezoid();
            case (2):
                return getRandomRectangle();
            case (3):
                return getRandomTriangle();
            case (4):
                return getRandomSquare();
            default:
                return defaultFigure();
        }
    }
}
