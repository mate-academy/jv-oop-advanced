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
                return getRandomSquare();
            case (1):
                return getRandomRectangle();
            case (2):
                return getRandomCircle();
            case (3):
                return getRandomRightTriangle();
            default:
                return getRandomRightIsoscelesTrapezoid();
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

    private Square getRandomSquare() {
        return new Square(getRandomColor(), getRandomInt(SIDE_LIMIT));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(getRandomColor(), getRandomInt(SIDE_LIMIT), getRandomInt(SIDE_LIMIT));
    }

    private Circle getRandomCircle() {
        return new Circle(getRandomColor(), getRandomInt(SIDE_LIMIT));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(getRandomColor(), getRandomInt(SIDE_LIMIT));
    }

    private IsoscelesTrapezoid getRandomRightIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandomColor(), getRandomInt(SIDE_LIMIT),
                getRandomInt(SIDE_LIMIT), getRandomInt(SIDE_LIMIT));
    }
}
