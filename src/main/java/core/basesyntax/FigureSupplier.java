package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE_LENGTH = 100;
    private static final int MAX_RADIUS = 50;
    private static final int MAX_TRIANGLE_LEG = 100;
    private static final int MAX_TRAPEZOID_BASE = 100;
    private static final int MAX_TRAPEZOID_HEIGHT = 50;
    private static final Random RANDOM = new Random();

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }

    public Square getRandomSquare() {
        double side = RANDOM.nextDouble(MAX_SIDE_LENGTH);
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        return new Square(side, color);
    }

    public Rectangle getRandomRectangle() {
        double length = RANDOM.nextDouble(MAX_SIDE_LENGTH);
        double width = RANDOM.nextDouble(MAX_SIDE_LENGTH);
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        return new Rectangle(length, width, color);
    }

    public Circle getRandomCircle() {
        double radius = RANDOM.nextDouble(MAX_RADIUS);
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        return new Circle(radius, color);
    }

    public RightTriangle getRandomRightTriangle() {
        double firstLeg = RANDOM.nextDouble(MAX_TRIANGLE_LEG);
        double secondLeg = RANDOM.nextDouble(MAX_TRIANGLE_LEG);
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        double base1 = RANDOM.nextDouble(MAX_TRAPEZOID_BASE);
        double base2 = RANDOM.nextDouble(MAX_TRAPEZOID_BASE);
        double height = RANDOM.nextDouble(MAX_TRAPEZOID_HEIGHT);
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        return new IsoscelesTrapezoid(base1, base2, height, color);
    }
}
