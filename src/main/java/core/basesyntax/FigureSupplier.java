package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_VALUE = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;
    private Shape figure;

    public FigureSupplier() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int index = random.nextInt(Shape.values().length);
        figure = Shape.values()[index];
        double side1 = random.nextDouble() * MAX_VALUE;
        double side2 = random.nextDouble() * MAX_VALUE;
        double side3 = random.nextDouble() * MAX_VALUE;
        switch (figure) {
            case CIRCLE:
                return new Circle(color, side1);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(color, side1, side2, side3);
            case RECTANGLE:
                return new Rectangle(color, side1, side2);
            case RIGHT_TRIANGLE:
                return new RightTriangle(color, side1, side2);
            case SQUARE:
                return new Square(color, side1);
            default: return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}
