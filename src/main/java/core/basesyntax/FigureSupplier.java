package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public double getRandomValue() {
        final double MAX_VALUE = 100;

        return random.nextDouble() * MAX_VALUE;
    }

    public Figure getRandomFigure() {
        final int FIGURE_COUNT = 5;
        final int FIGURE_NUMBER = random.nextInt(FIGURE_COUNT);
        final String COLOR = colorSupplier.getRandomColor();

        switch (FIGURE_NUMBER) {
            case 0:
                final double RADIUS = getRandomValue();

                return new Circle(COLOR, RADIUS);
            case 1:
                final double SIDE = getRandomValue();

                return new Square(COLOR, SIDE);
            case 2:
                final double FIRST_SIDE = getRandomValue();
                final double SECOND_SIDE = getRandomValue();

                return new Rectangle(COLOR, FIRST_SIDE, SECOND_SIDE);
            case 3:
                final double FIRST_LEG = getRandomValue();
                final double SECOND_LEG = getRandomValue();

                return new RightTriangle(COLOR, FIRST_LEG, SECOND_LEG);
            default:
                final double FIRST_BASE = getRandomValue();
                final double SECOND_BASE = getRandomValue();
                final double HEIGHT = getRandomValue();

                return new IsoscelesTrapezoid(COLOR, FIRST_BASE, SECOND_BASE, HEIGHT);
        }
    }

    public Figure getDefaultFigure() {
        final String COLOR = Color.WHITE.name();
        final double RADIUS = 10.0;

        return new Circle(COLOR, RADIUS);
    }
}
