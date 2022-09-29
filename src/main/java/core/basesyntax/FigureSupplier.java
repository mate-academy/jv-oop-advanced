package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURES_COUNT = 5;
    private final ColorSupplier colorSupplier;
    private Random random;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public Figure getRandomFigure() {
        // generate figure with random properties here
        int value = new Random().nextInt(5);
        switch (value) {
            case 1:
                return new RightTriangle(5, 6);
            case 2:
                return new Circle(33);
            case 3:
                return new IsoscelesTrapezoid(33, 2, 12);
            case 4:
                return new Rectangle(33, 32);
            default:
                return new Square(7);
        }
    }

    public Figure getDefaultFigure() {
        //this method should always return white circle with radius 10.
        Figure circle = new Circle(10);
        circle.setColor("white");
        return circle;

    }

    @Override
    public String toString() {
        return "FigureSupplier{"
                + "colorSupplier="
                + colorSupplier
                + ", random="
                + random
                + '}';
    }
}
