package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";
    private static final int RANDOM_MAX = 19;
    private static final int RANDOM_MIN = 1;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FiguresType figuresType = FiguresType.values()
                [random.nextInt(FiguresType.values().length)];;
        switch (figuresType.name()) {
            case "SQUARE":
                return new Square(random.nextInt(RANDOM_MAX) + RANDOM_MIN,
                        colorSupplier.getRandomColor());
            case "RECTANGLE":
                return new Rectangle(random.nextInt(RANDOM_MAX) + RANDOM_MIN,
                        random.nextInt(RANDOM_MAX) + RANDOM_MIN, colorSupplier.getRandomColor());
            case "RIGHT_TRIANGLE":
                return new RightTriangle(random.nextInt(RANDOM_MAX) + RANDOM_MIN,
                        random.nextInt(RANDOM_MAX) + RANDOM_MIN,
                        colorSupplier.getRandomColor());
            case "CIRCLE":
                return new Circle(random.nextInt(RANDOM_MAX) + RANDOM_MIN,
                        colorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(random.nextInt(RANDOM_MAX) + RANDOM_MIN,
                        random.nextInt(RANDOM_MAX) + RANDOM_MIN,
                        random.nextInt(RANDOM_MAX) + RANDOM_MIN, colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
