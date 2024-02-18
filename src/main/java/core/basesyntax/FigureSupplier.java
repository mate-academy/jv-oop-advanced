package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Square(random.nextDouble() * 10 + 1, Color.GREEN.name());
            case 1:
                return new Rectangle(random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1, Color.RED.name());
            case 2:
                return new RightTriangle(random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1, Color.PURPLE.name());
            case 3:
                return new Circle(random.nextDouble() * 10 + 1, Color.ORANGE.name());
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1, Color.PINK.name());
            default:
                return null;
        }
    }

    public Figure[] getDefaultFigures() {
        Figure[] defaultFigures = new Figure[FIGURE_COUNT];
        for (int i = 0; i < FIGURE_COUNT; i++) {
            defaultFigures[i] = getRandomFigure();
        }
        return defaultFigures;
    }
}
