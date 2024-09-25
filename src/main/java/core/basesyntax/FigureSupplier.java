package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_RANDOM_VALUE = 10;
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    public static final double DEFAULT_RADIUS = 10;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 0:
                return new Square(color, random.nextInt(MAX_RANDOM_VALUE) + 1);
            case 1:
                return new Rectangle(color, random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1);
            case 2:
                return new RightTriangle(color, random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1);
            case 3:
                return new Circle(color, random.nextInt(MAX_RANDOM_VALUE) + 1);
            case 4:
                return new IsoscelesTrapezoid(color, random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1, random.nextInt(MAX_RANDOM_VALUE) + 1);
            default:
                throw new IllegalArgumentException("Invalid figure number: " + figureNumber);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
