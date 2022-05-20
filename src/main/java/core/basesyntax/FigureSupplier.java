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
        String randColor = colorSupplier.getRandomColor();
        String figureChoice = Shape.values()[random.nextInt(Shape.values().length)].toString();
        switch (figureChoice) {
            case "CIRCLE":
                return new Circle(random.nextInt(RANDOM_INTEGER), randColor);
            case "ISOSCELES_TRAPEZOID":
                return new IsoscelesTrapezoid(
                        random.nextInt(RANDOM_INTEGER),
                        random.nextInt(RANDOM_INTEGER),
                        random.nextInt(RANDOM_INTEGER),
                        randColor);
            case "RECTANGLE":
                return new Rectangle(
                        random.nextInt(RANDOM_INTEGER),
                        random.nextInt(RANDOM_INTEGER),
                        randColor);
            case "RIGHT_TRIANGLE":
                return new RightTriangle(
                        random.nextInt(RANDOM_INTEGER),
                        random.nextInt(RANDOM_INTEGER),
                        randColor);
            default:
                return new Square(random.nextInt(RANDOM_INTEGER), randColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR);
    }
}
