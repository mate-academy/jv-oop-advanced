package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Square(getRandomValue(), getRandomColor());
            case 1:
                return new Rectangle(getRandomValue(), getRandomValue(), getRandomColor());
            case 2:
                return new RightTriangle(getRandomValue(), getRandomValue(), getRandomColor());
            case 3:
                return new Circle(getRandomValue(), getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(getRandomValue(), getRandomValue(), getRandomValue(),
                        getRandomColor());
            default:
                return null;
        }
    }

    private double getRandomValue() {
        return random.nextDouble() * 10 + 1;
    }

    private String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].name();
    }

    public Figure[] getDefaultFigures() {
        Figure[] defaultFigures = new Figure[FIGURE_COUNT];
        for (int i = 0; i < FIGURE_COUNT; i++) {
            defaultFigures[i] = getRandomFigure();
        }
        return defaultFigures;
    }
}
