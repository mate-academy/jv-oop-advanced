package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    static final int DEFAULT_RADIUS = 10;
    static final String DEFAULT_COLOR = "WHITE";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Random getRandom() {
        return random;
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public Figure getRandomFigure() {

        int figureType = random.nextInt(5);

        return switch (figureType) {
            case 0 -> new Square(random.nextDouble(100),
                    ColorSupplier.getRandomColor());

            case 1 -> new Circle(random.nextDouble(100),
                    ColorSupplier.getRandomColor());

            case 2 -> new Rectangle(random.nextDouble(100),
                    random.nextDouble(100),
                    ColorSupplier.getRandomColor());

            case 3 -> new RightTriangle(random.nextDouble(100),
                    random.nextDouble(100),
                    ColorSupplier.getRandomColor());

            case 4 -> new IsoscelesTrapezoid(random.nextDouble(100),
                    random.nextDouble(100),
                    random.nextDouble(100),
                    ColorSupplier.getRandomColor());

            default -> new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
