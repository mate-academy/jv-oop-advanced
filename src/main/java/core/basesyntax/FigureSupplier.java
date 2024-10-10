package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_VALUE = 10;
    private static final Color COLOR_WHITE = Color.WHITE;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = getRandomNumber();
        String color = colorSupplier.getRandomColor();

        int radius = getRandomNumber();
        int sideOne = getRandomNumber();
        int sideTwo = getRandomNumber();
        int length = getRandomNumber();

        switch (figureNumber) {
            case 0:
                return new Square(color, sideOne);
            case 1:
                return new Rectangle(color, sideOne,sideTwo);
            case 2:
                return new RightTriangle(color, sideOne, sideTwo);
            case 3:
                return new Circle(color, radius);
            case 4:
                return new IsoscelesTrapezoid(color, sideOne, sideTwo, length);
            default:
                return new IsoscelesTrapezoid(color, sideOne, sideTwo, length);
        }
    }

    public Figure getDefaultFigure() {
        String color = COLOR_WHITE.name().toLowerCase();
        return new Circle(color, DEFAULT_VALUE);
    }

    private int getRandomNumber() {
        return random.nextInt(FIGURE_COUNT);
    }
}
