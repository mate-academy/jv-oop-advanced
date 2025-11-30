package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();
    private static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_MIN = 1.0;
    private static final double DEFAULT_MAX = 10;
    private static final double DEFAULT_RADIUS = 10.0;

    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURE_COUNT);
        double size = randomDouble(DEFAULT_MIN,DEFAULT_MAX);
        String color = String.valueOf(colorSupplier.getRandomColor());

        switch (type) {
            case 0:
                double side = randomDouble(DEFAULT_MIN, DEFAULT_MAX);
                return new Square(side, color);
            case 1:
                double w = randomDouble(DEFAULT_MIN, DEFAULT_MAX);
                double h = randomDouble(DEFAULT_MIN, DEFAULT_MAX);
                return new Rectangle(w, h, color);
            case 2:
                double radius = randomDouble(DEFAULT_MIN, DEFAULT_MAX)
                return new Circle(radius, color);
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

    public Figure getDefaultFigure() {
        return new Circle("White", DEFAULT_RADIUS); // біле коло з радіусом 10
    }

    private double randomDouble(double min, double max) {
        return min + random.nextDouble() * (max - min);
    }

