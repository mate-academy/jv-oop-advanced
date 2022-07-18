package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT_OF_FIGURES = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int MAX_CIRCLE_RADIUS = 20;
    private static final int MAX_SQUARE_SIDE = 20;
    private static final int MAX_RECTANGLE_WIDTH = 20;
    private static final int MAX_RECTANGLE_HEIGHT = 10;
    private static final int MAX_TRIANGLE_FIRST_LEG = 20;
    private static final int MAX_TRIANGLE_SECOND_LEG = 10;
    private static final int MAX_ISOSCELES_TRAPEZOID_HEIGHT = 10;
    private static final int MAX_ISOSCELES_TRAPEZOID_BASE = 20;
    private static final int MAX_ISOSCELES_TRAPEZOID_TOP = 20;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(AMOUNT_OF_FIGURES);
        switch (randomIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Circle getRandomCircle() {
        return new Circle(random.nextInt(MAX_CIRCLE_RADIUS), colorSupplier.getRandomColor());
    }

    public Square getRandomSquare() {
        return new Square(random.nextInt(MAX_SQUARE_SIDE), colorSupplier.getRandomColor());
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(random.nextInt(MAX_RECTANGLE_WIDTH),
                random.nextInt(MAX_RECTANGLE_HEIGHT), colorSupplier.getRandomColor());
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(MAX_TRIANGLE_FIRST_LEG),
                random.nextInt(MAX_TRIANGLE_SECOND_LEG), colorSupplier.getRandomColor());
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_ISOSCELES_TRAPEZOID_BASE),
                random.nextInt(MAX_ISOSCELES_TRAPEZOID_TOP),
                random.nextInt(MAX_ISOSCELES_TRAPEZOID_HEIGHT), colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, DEFAULT_COLOR.name());
    }
}
