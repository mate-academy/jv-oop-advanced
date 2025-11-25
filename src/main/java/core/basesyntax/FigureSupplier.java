package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final String DEFAULT_COLOR = "white";
    private static final int MAX_RANDOM_SIDE = 10;
    private static final int FIGURES_NUMBER = 5;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURES_NUMBER);
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case 0:
                return new Square(color, random.nextInt(MAX_RANDOM_SIDE) + 1);
            case 1:
                return new Rectangle(color, random.nextInt(MAX_RANDOM_SIDE) + 1, random.nextInt(MAX_RANDOM_SIDE) + 1);
            case 2:
                return new Circle(color, random.nextInt(MAX_RANDOM_SIDE) + 1);
            case 3:
                return new RightTriangle(color, random.nextInt(MAX_RANDOM_SIDE) + 1, random.nextInt(MAX_RANDOM_SIDE) + 1);
            default:
                return new IsoscelesTrapezoid(color,
                        random.nextInt(MAX_RANDOM_SIDE) + 1,
                        random.nextInt(MAX_RANDOM_SIDE) + 1,
                        random.nextInt(MAX_RANDOM_SIDE) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
