package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND_OF_CASES = 5;
    private static final int BOUND_OF_LENGTH = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 12;
    private static final int ORIGIN = 1;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private int randomNumber() {
        return random.nextInt(ORIGIN, BOUND_OF_LENGTH);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(BOUND_OF_CASES);
        String colorOfFigure = colorSupplier.getRandomColor();

        switch (index) {
            case 0 -> {
                return new Circle(randomNumber(), colorOfFigure);
            }
            case 1 -> {
                return new Rectangle(randomNumber(), randomNumber(), colorOfFigure);
            }
            case 2 -> {
                return new RightTriangle(randomNumber(), randomNumber(), colorOfFigure);
            }
            case 3 -> {
                return new IsoscelesTrapezoid(randomNumber(), randomNumber(),
                        randomNumber(), colorOfFigure);
            }
            case 4 -> {
                return new Square(randomNumber(), colorOfFigure);
            }
            default -> {
                return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
