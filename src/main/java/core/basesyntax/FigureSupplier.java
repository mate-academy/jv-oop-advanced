package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random random = new Random();
    private static final String DEFAULT_COLOR = Color.WHITE.toString();
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        int numberRandom = random.nextInt(5);
        String color = colorSupplier.getRandomColor().name();
        final int multiplier = 10;
        final int shift = 1;

        switch (numberRandom) {
            case 0:
                return prepareSquare(multiplier, shift, color);
            case 1:
                return prepareRectangle(multiplier, shift, color);
            case 2:
                return prepareCircle(multiplier, shift, color);
            case 3:
                return prepareRightTriangle(multiplier, shift, color);
            case 4:
                return prepareIsoscelesTrapezoid(multiplier, shift, color);
            default:
                return getDefaultFigure();
        }
    }

    private static IsoscelesTrapezoid prepareIsoscelesTrapezoid(int multiplier,
                                                                int shift, String color) {
        double topBase = random.nextDouble() * multiplier + shift;
        double bottomBase = random.nextDouble() * multiplier + shift;
        double height = random.nextDouble() * multiplier + shift;
        return new IsoscelesTrapezoid(color, topBase, bottomBase, height);
    }

    private static Circle prepareCircle(int multiplier, int shift, String color) {
        double radius = random.nextDouble() * multiplier + shift;
        return new Circle(color, radius);
    }

    private static RightTriangle prepareRightTriangle(int multiplier, int shift, String color) {
        double firstLeg = random.nextDouble() * multiplier + shift;
        double secondLeg = random.nextDouble() * multiplier + shift;
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private static Rectangle prepareRectangle(int multiplier, int shift, String color) {
        double length = random.nextDouble() * multiplier + shift;
        double width = random.nextDouble() * multiplier + shift;
        return new Rectangle(color, length, width);
    }

    private static Square prepareSquare(int multiplier, int shift, String color) {
        double side = random.nextDouble() * multiplier + shift;
        return new Square(color, side);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
