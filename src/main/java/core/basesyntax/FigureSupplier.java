package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND_RANDOM_FIGURE_NUMBER = 5;
    private static final int BOUND_RANDOM_SIDE = 10;
    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_NAME = "DEFAULT FIGURE";
    private final ColorSupplier color = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomNumber = getRandomFigureNumber();
        switch (randomNumber) {
            case (0):
                return new Circle("RandomCircle",
                        color.getRandomColor(),
                        getRandomSide());
            case (1):
                return new Square("RandomSquare",
                        color.getRandomColor(),
                        getRandomSide());
            case (2):
                return new Rectangle("RandomRectangle",
                        color.getRandomColor(),
                        getRandomSide(),
                        getRandomSide());
            case (3):
                return new IsoscelesTrapezoid("RandomIsoscelesTrapezoid",
                        color.getRandomColor(),
                        getRandomSide(),
                        getRandomSide(),
                        getRandomSide());
            default:
                return new RightTriangle("RandomRightTriangle",
                        color.getRandomColor(),
                        getRandomSide(),
                        getRandomSide());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_NAME,
                color.getDefaultColor(),
                DEFAULT_RADIUS);
    }

    private int getRandomFigureNumber() {
        return random.nextInt(BOUND_RANDOM_FIGURE_NUMBER);
    }

    private double getRandomSide() {
        return random.nextInt(BOUND_RANDOM_SIDE) + 1;
    }

}
