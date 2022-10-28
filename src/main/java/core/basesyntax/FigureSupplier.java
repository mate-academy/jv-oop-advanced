package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int SIDE_LIMIT = 1;
    private static final int SIDE_DEFAULT = 10;
    private static final int FIGURE_TOTAL = 4;
    private static final String COLOR_DEFAULT = Colors.WHITE.name();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int indexFigure = random.nextInt(FIGURE_TOTAL);
        switch (indexFigure) {
            case (0):
                return new Square(getRandomColor(), getRandomInt(SIDE_LIMIT));
            case (1):
                return new Rectangle(getRandomColor(),
                        getRandomInt(SIDE_LIMIT), getRandomInt(SIDE_LIMIT));
            case (2):
                return new Circle(getRandomColor(), getRandomInt(SIDE_LIMIT));
            case (3):
                return new RightTriangle(getRandomColor(), getRandomInt(SIDE_LIMIT));
            default:
                return new IsoscelesTrapezoid(getRandomColor(), getRandomInt(SIDE_LIMIT),
                        getRandomInt(SIDE_LIMIT), getRandomInt(SIDE_LIMIT));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR_DEFAULT, SIDE_DEFAULT);
    }

    public int getRandomInt(int maxBound) {
        return random.nextInt(maxBound) + 1;
    }

    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        return Colors.values()[index].name();
    }
}
