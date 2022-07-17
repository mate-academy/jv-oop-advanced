package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 8;
    public static final int FIGURE_BOUNDARY = 10;
    public static final String DEFAULT_COLOR = "white";

    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = generateNumber(FIGURE_COUNT);

        switch (randomFigure) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomRectangle();
            case 5:
                return getIsoscelesTrapezoid();
            default:
                return getRandomFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(FIGURE_BOUNDARY,DEFAULT_COLOR);
    }

    private int generateNumber(int maxValue) {
        int minValue = 1;
        return random.nextInt(maxValue - minValue) + minValue;
    }

    private Circle getRandomCircle() {
        int radius = generateNumber(FIGURE_BOUNDARY);
        String randomColor = color.getRandomColor();
        return new Circle(radius, randomColor);
    }

    private Square getRandomSquare() {
        int side = generateNumber(FIGURE_BOUNDARY);
        String randomColor = color.getRandomColor();
        return new Square(side, randomColor);
    }

    private RightTriangle getRandomRightTriangle() {
        int firstSide = generateNumber(FIGURE_BOUNDARY);
        int secondSide = generateNumber(FIGURE_BOUNDARY);
        String randomColor = color.getRandomColor();
        return new RightTriangle(firstSide, secondSide, randomColor);
    }

    private Rectangle getRandomRectangle() {
        int base = generateNumber(FIGURE_BOUNDARY);
        int height = generateNumber(FIGURE_BOUNDARY);
        String randomColor = color.getRandomColor();
        return new Rectangle(base, height, randomColor);
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        int firstBase = generateNumber(FIGURE_BOUNDARY);
        int secondBase = generateNumber(FIGURE_BOUNDARY);
        int height = generateNumber(FIGURE_BOUNDARY);
        String randomColor = color.getRandomColor();
        return new IsoscelesTrapezoid(firstBase, secondBase, height, randomColor);
    }
}
