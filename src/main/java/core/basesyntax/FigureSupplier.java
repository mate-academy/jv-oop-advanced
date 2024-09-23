package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int SWITCH_BOUND = 5;
    private static final int RADIUS_OF_DEFAULT_FIGURE = 10;
    private static final int ORIGIN = 1;
    private static final int MAX_VALUE = 100;
    private static final String COLOR_OF_DEFAULT_FIGURE = "white";

    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int index = random.nextInt(SWITCH_BOUND);
        String color = colorSupplier.getRandomColor();

        switch (index) {
            case 0 -> {
                return new Circle(randomNumber(),
                        color);
            }
            case 1 -> {
                return new IsoscelesTrapezoid(randomNumber(),
                        randomNumber(),
                        randomNumber(),
                        color);
            }
            case 2 -> {
                return new Rectangle(randomNumber(),
                        randomNumber(),
                        color);
            }
            case 3 -> {
                return new Square(randomNumber(),
                        color);
            }
            case 4 -> {
                return new RightTriangle(randomNumber(),
                        randomNumber(),
                        color);
            }
            default -> {
                return getDefaultFigure();
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(RADIUS_OF_DEFAULT_FIGURE, COLOR_OF_DEFAULT_FIGURE);
    }

    public int randomNumber() {
        return new Random().nextInt(ORIGIN, MAX_VALUE);
    }
}
