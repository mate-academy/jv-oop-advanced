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

        switch (figureNumber) {
            case 0:
                return new Square(color, getRandomNumber());
            case 1:
                return new Rectangle(color, getRandomNumber(), getRandomNumber());
            case 2:
                return new RightTriangle(color, getRandomNumber(), getRandomNumber());
            case 3:
                return new Circle(color, getRandomNumber());
            case 4:
                return new IsoscelesTrapezoid(color,
                            getRandomNumber(),
                            getRandomNumber(),
                            getRandomNumber());
            default:
                return getDefaultFigure();
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
