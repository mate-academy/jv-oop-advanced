package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public final Circle getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }

    public Square getRandomSquare() {
        double side = random.nextDouble(MAX_SIDE);
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        return new Square(side, color);
    }

    public Rectangle getRandomRectangle() {
        double length = random.nextDouble(MAX_SIDE);
        double width = random.nextDouble(MAX_SIDE);
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        return new Rectangle(length, width, color);
    }

    public Circle getRandomCircle() {
        double radius = random.nextDouble(MAX_SIDE);
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        return new Circle(radius, color);
    }

    public RightTriangle getRandomRightTriangle() {
        double firstLeg = random.nextDouble(MAX_SIDE);
        double secondLeg = random.nextDouble(MAX_SIDE);
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        double base1 = random.nextDouble(MAX_SIDE);
        double base2 = random.nextDouble(MAX_SIDE);
        double height = random.nextDouble(MAX_SIDE);
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        return new IsoscelesTrapezoid(base1, base2, height, color);
    }
}
