package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_INTEGER = 10;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = "WHITE";
    private final Random random;

    public FigureSupplier(Random random) {
        this.random = random;
    }

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier(random);
        String randomColor = colorSupplier.getRandomColor();
        switch (Shape.values()[random.nextInt(Shape.values().length)].toString()) {
            case "CIRCLE":
                Circle circle = new Circle(random.nextInt(RANDOM_INTEGER));
                circle.setColor(randomColor);
                return circle;
            case "ISOSCELES_TRAPEZOID":
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(
                        random.nextInt(RANDOM_INTEGER),
                        random.nextInt(RANDOM_INTEGER),
                        random.nextInt(RANDOM_INTEGER));
                isoscelesTrapezoid.setColor(randomColor);
                return isoscelesTrapezoid;
            case "RECTANGLE":
                Rectangle rectangle = new Rectangle(random.nextInt(RANDOM_INTEGER),
                        random.nextInt(RANDOM_INTEGER));
                rectangle.setColor(randomColor);
                return rectangle;
            case "RIGHT_TRIANGLE":
                RightTriangle rightTriangle = new RightTriangle(random.nextInt(RANDOM_INTEGER),
                        random.nextInt(RANDOM_INTEGER));
                rightTriangle.setColor(randomColor);
                return rightTriangle;
            case "SQUARE":
                Square square = new Square(random.nextInt(RANDOM_INTEGER));
                square.setColor(randomColor);
                return square;
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(DEFAULT_CIRCLE_RADIUS);
        circle.setColor(DEFAULT_CIRCLE_COLOR);
        return circle;
    }
}
