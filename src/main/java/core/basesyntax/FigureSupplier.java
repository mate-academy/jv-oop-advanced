package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int SCALE_FACTOR = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        return switch (figureType) {
            case 0 -> getIsoscelesTrapezoid(color);
            case 1 -> getSquare(color);
            case 2 -> getRectangle(color);
            case 3 -> getCircle(color);
            default -> getRightTriangle(color);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getIsoscelesTrapezoid(String color) {
        double firstLeg = getRandomParameter();
        double secondLeg = getRandomParameter();
        double trapezoidHeight = getRandomParameter();
        return new IsoscelesTrapezoid(color, firstLeg, secondLeg, trapezoidHeight);
    }

    private Figure getSquare(String color) {
        double sideLength = getRandomParameter();
        return new Square(color, sideLength);
    }

    private Figure getRectangle(String color) {
        double weight = getRandomParameter();
        double height = getRandomParameter();
        return new Rectangle(color, weight, height);
    }

    private Figure getCircle(String color) {
        double radius = getRandomParameter();
        return new Circle(color, radius);
    }

    private Figure getRightTriangle(String color) {
        double base = getRandomParameter();
        double triangleHeight = getRandomParameter();
        return new RightTriangle(color, base, triangleHeight);
    }

    private double getRandomParameter() {
        return random.nextDouble() * SCALE_FACTOR + 1;
    }
}
