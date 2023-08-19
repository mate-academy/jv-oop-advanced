package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND_RANDOM_FIGURE_NUMBER = 5;
    private static final int BOUND_RANDOM_SIDE = 10;
    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_NAME = "DEFAULT FIGURE";
    private Random random = new Random();

    private int getRandomFigureNumber() {
        return random.nextInt(BOUND_RANDOM_FIGURE_NUMBER);
    }

    private double getRandomSide() {
        return random.nextInt(BOUND_RANDOM_SIDE) + 1;
    }

    public Figure getRandomFigure() {
        int randomNumber = getRandomFigureNumber();
        ColorSupplier randomColor = new ColorSupplier();
        switch (randomNumber) {
            case (0):
                return new Circle("RandomCircle",
                        randomColor.getRandomColor(),
                        getRandomSide());
            case (1):
                return new Square("RandomSquare",
                        randomColor.getRandomColor(),
                        getRandomSide());
            case (2):
                return new Rectangle("RandomRectangle",
                        randomColor.getRandomColor(),
                        getRandomSide(),
                        getRandomSide());
            case (3):
                return new IsoscelesTrapezoid("RandomIsoscelesTrapezoid",
                        randomColor.getRandomColor(),
                        getRandomSide(),
                        getRandomSide(),
                        getRandomSide());
            default:
                return new RightTriangle("RandomRightTriangle",
                        randomColor.getRandomColor(),
                        getRandomSide(),
                        getRandomSide());
        }
    }

    public Figure getDefaultFigure() {
        ColorSupplier defaultColor = new ColorSupplier();
        return new Circle(DEFAULT_NAME,
                defaultColor.getDefaultColor(),
                DEFAULT_RADIUS);
    }

}
