package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_FIGURES_COUNT = 5;

    private static final int MIN_BASE = 3;
    private static final int MAX_BASE = 10;

    private static final int MIN_HEIGHT = 2;
    private static final int MAX_HEIGHT = 6;

    private static final int MIN_RADIUS = 1;
    private static final int MAX_RADIUS = 10;

    private static final int MIN_SIDE = 2;
    private static final int MAX_SIDE = 10;

    private static final int MIN_LEG = 2;
    private static final int MAX_LEG = 8;

    private static final double DEFAULT_CIRCLE_RADIUS = 10.0;
    private static final String DEFAULT_CIRCLE_COLOR = "White";

    private final Random random = new Random();

    public Figure getRandomFigure() {
        String color = ColorSupplier.getRandomColor();
        int type = random.nextInt(RANDOM_FIGURES_COUNT);

        return switch (type) {
            case 0 -> valueIsoscelesTrapezoid(color);
            case 1 -> valueCircle(color);
            case 2 -> valueRightTriangle(color);
            case 3 -> valueRectangle(color);
            case 4 -> valueSquare(color);
            default -> getRandomFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    private Figure valueIsoscelesTrapezoid(String color) {
        double base1 = random(MIN_BASE, MAX_BASE);
        double base2 = random(MIN_BASE, MAX_BASE);
        double height = random(MIN_HEIGHT, MAX_HEIGHT);

        return new IsoscelesTrapezoid(color, base1, base2, height);
    }

    private Figure valueCircle(String color) {
        double radius = random(MIN_RADIUS, MAX_RADIUS);

        return new Circle(color, radius);
    }

    private Figure valueRightTriangle(String color) {
        double firstLeg = random(MIN_LEG, MAX_LEG);
        double secondLeg = random(MIN_LEG, MAX_LEG);

        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure valueRectangle(String color) {
        double width = random(MIN_SIDE, MAX_SIDE);
        double height = random(MIN_SIDE, MAX_SIDE);

        return new Rectangle(color, width, height);
    }

    private Figure valueSquare(String color) {
        double side = random(MIN_SIDE, MAX_SIDE);

        return new Square(color, side);
    }

    private double random(double min, double max) {
        return min + random.nextDouble() * (max - min);
    }
}
