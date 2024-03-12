package core.basesyntax.model;

import core.basesyntax.color.Color;
import core.basesyntax.color.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_UNITS = 20;
    private static final int FIGURE_NUMBER = 5;
    private static final int DEFAULT_SIZE = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_NUMBER);
        return switch (figureType) {
            case 0 -> new Circle(random.nextDouble(MAX_RANDOM_UNITS),
                    colorSupplier.getRandomColor());
            case 1 -> new Square(random.nextInt(MAX_RANDOM_UNITS),
                    colorSupplier.getRandomColor());
            case 2 -> new RightTriangle(random.nextInt(MAX_RANDOM_UNITS),
                    random.nextInt(MAX_RANDOM_UNITS), colorSupplier.getRandomColor());
            case 3 -> new Rectangle(random.nextInt(MAX_RANDOM_UNITS),
                    random.nextInt(MAX_RANDOM_UNITS), colorSupplier.getRandomColor());
            default -> new IsoscelesTrapezoid(random.nextInt(MAX_RANDOM_UNITS),
                    random.nextInt(MAX_RANDOM_UNITS), random.nextInt(MAX_RANDOM_UNITS),
                    colorSupplier.getRandomColor());
        };
    }

    public Figure getDeafultFigure() {
        return new Circle(DEFAULT_SIZE, Color.WHITE.name());
    }
}
