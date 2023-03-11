package core.basesyntax;

import java.util.Random;

public class AreaCalculator {
    private static final int MAX_NUMBER = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Circle getRandomCircle() {
        int radius = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    public Square getRandomSquare() {
        int sideLength = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new Square(color, sideLength);
    }

    public Rectangle getRandomRectangle() {
        int width = random.nextInt(MAX_NUMBER);
        int height = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new Rectangle(color, width, height);
    }

    public RightTriangle getRandomRightTriangle() {
        int firstLeg = random.nextInt(MAX_NUMBER);
        int secondLeg = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int topLength = random.nextInt(MAX_NUMBER);
        int bottomLength = random.nextInt(MAX_NUMBER);
        int height = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, topLength, bottomLength, height);
    }
}
