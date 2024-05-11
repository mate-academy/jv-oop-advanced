package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MULTIPLIER = 10;
    private static final Random RANDOM = new Random();
    private static final int FIGURE_COUNT = 5;

    public final AbstractFigure getDefaultFigure() {
        Colors color = Colors.WHITE;
        double radius = 10;
        return new Circle(color, radius);
    }

    public final AbstractFigure getRandomFigure() {
        Colors color = ColorSupplier.getRandomColor();
        int randomIndex = RANDOM.nextInt(FIGURE_COUNT);

        return switch (randomIndex) {
            case 0 -> new Square(color, getRandomValue());
            case 1 -> new Rectangle(color, getRandomValue(), getRandomValue());
            case 2 -> new RightTriangle(color, getRandomValue(), getRandomValue());
            case 3 -> new Circle(color, getRandomValue());
            case 4 -> new IsoscelesTrapezoid(color, getRandomValue(), getRandomValue(),
                    getRandomValue());
            default -> null;
        };
    }

    private static double getRandomValue() {
        return RANDOM.nextDouble() * MULTIPLIER;
    }
}

