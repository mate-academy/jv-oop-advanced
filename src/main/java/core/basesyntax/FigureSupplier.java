package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_MIN = 1.0;
    private static final double DEFAULT_MAX = 10;
    private static final double DEFAULT_RADIUS = 10.0;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Drawable getRandomFigure() {
        int type = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case 0:
                double side = randomDouble(DEFAULT_MIN, DEFAULT_MAX);
                return new Square(side, color);
            case 1:
                double w = randomDouble(DEFAULT_MIN, DEFAULT_MAX);
                double h = randomDouble(DEFAULT_MIN, DEFAULT_MAX);
                return new Rectangle(color, w, h);
            case 2:
                double radius = randomDouble(DEFAULT_MIN, DEFAULT_MAX);
                return new Circle(color, radius);
            case 3:
                double firstLeg = randomDouble(DEFAULT_MIN, DEFAULT_MAX);
                double secondLeg = randomDouble(DEFAULT_MIN, DEFAULT_MAX);
                return new RightTriangle(color, firstLeg, secondLeg);
            case 4:
                double topBase = randomDouble(DEFAULT_MIN, DEFAULT_MAX);
                double bottomBase = randomDouble(DEFAULT_MIN, DEFAULT_MAX);
                double trapezoidHeight = randomDouble(DEFAULT_MIN, DEFAULT_MAX);
                return new IsoscelesTrapezoid(color, topBase, bottomBase, trapezoidHeight);

            default:
                return getDefaultFigure();

        }

    }

    public Drawable getDefaultFigure() {
        return new Circle("White", DEFAULT_RADIUS);
    }

    private double randomDouble(double min, double max) {
        return min + random.nextDouble() * (max - min);
    }

}
