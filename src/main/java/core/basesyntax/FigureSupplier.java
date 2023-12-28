package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAXIMUM_NUMBER = 100;
    private static final int UNIQUE_PARAMETER = 9;
    private static final int CIRCLE_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(Shape.values().length);
        Shape figure = Shape.values()[index];
        String color = colorSupplier.getRandomColor().name();
        int[] number = new int[UNIQUE_PARAMETER];
        for (int i = 0; i < UNIQUE_PARAMETER; i++) {
            number[i] = random.nextInt(MAXIMUM_NUMBER);
        }
        int i = 0;
        return switch (figure) {
            case SQUARE -> new Square(number[i], color);
            case RECTANGLE -> new Rectangle(number[i++], number[i++], color);
            case RIGHTTRIANGLE -> new RightTriangle(number[i++], number[i++], color);
            case CIRCLE -> new Circle(number[i++], color);
            default -> new IsoscelesTrapezoid(number[i++], number[i++], number[i++], color);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_RADIUS, "WHITE");
    }
}
