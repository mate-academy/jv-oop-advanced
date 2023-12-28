package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAXIMUM_NUMBER = 100;
    private static final int UNIQUE_NUMBER = 3;
    private static final int CIRCLE_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(Shape.values().length);
        Shape figure = Shape.values()[index];
        String color = colorSupplier.getRandomColor().name();
        int[] number = new int[UNIQUE_NUMBER];
        for (int i = 0; i < UNIQUE_NUMBER; i++) {
            number[i] = random.nextInt(MAXIMUM_NUMBER);
        }
        return switch (figure) {
            case SQUARE -> new Square(number[0], color);
            case RECTANGLE -> new Rectangle(number[0], number[1], color);
            case RIGHTTRIANGLE -> new RightTriangle(number[0], number[1], color);
            case CIRCLE -> new Circle(number[1], color);
            default -> new IsoscelesTrapezoid(number[0], number[1], number[2], color);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_RADIUS, "WHITE");
    }
}
