package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final double RANDOM_MAX_VALUE = 3;

    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(FIGURE_COUNT);
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (randomNumber) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomNum());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomNum(), getRandomNum());
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomNum(), getRandomNum(), getRandomNum());
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomNum(), getRandomNum());
            default:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomNum(), getRandomNum());
        }
    }

    private double getRandomNum() {
        return random.nextDouble() + FIGURE_COUNT - RANDOM_MAX_VALUE;
    }
}
