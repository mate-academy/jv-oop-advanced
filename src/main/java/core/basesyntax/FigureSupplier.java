package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double CIRCLE_RADIUS = 10;
    private static final int FIGURE_BOUND = 5;
    private static final int MAX_BOUND_NUMBER = 100;
    private static final String DEFAULT_COLOR = "white";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_BOUND)) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), getRandomNumber());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber(), getRandomNumber());
            default:
                return new Square(colorSupplier.getRandomColor(), getRandomNumber());
        }
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_BOUND_NUMBER);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, CIRCLE_RADIUS);
    }
}
