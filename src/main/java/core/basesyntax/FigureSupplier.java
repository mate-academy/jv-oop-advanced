package core.basesyntax;

import java.awt.Color;
import java.util.Random;

public class FigureSupplier {
    private static final int RANGE = 101;
    private final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Type[] types = Type.values();
        Type figure = types[random.nextInt(types.length)];
        String randomColor = colorSupplier.getRandomColor();
        switch (figure) {
            case SQUARE: {
                return new Square(random.nextInt(RANGE),
                        randomColor);
            }
            case ISOSCELESTRAPEZOID: {
                return new IsoscelesTrapezoid(random.nextInt(RANGE),
                        random.nextInt(RANGE), random.nextInt(RANGE),
                        randomColor);
            }
            case CIRCLE: {
                return new Circle(random.nextInt(RANGE),
                        colorSupplier.getRandomColor().toString().toLowerCase());
            }
            case RESTANGLE: {
                return new Rectangle(random.nextInt(RANGE), random.nextInt(RANGE),
                        randomColor);
            }
            case RIGHTTRIANGLE: {
                return new RightTriangle(random.nextInt(RANGE),
                        random.nextInt(RANGE),
                        randomColor);
            }

            default: {
                throw new IllegalStateException("Unexpected Type value: " + figure);
            }
        }
    }
    public Figure getDefaultFigure() {
        Circle circle = new Circle(random.nextInt(), colorSupplier.getRandomColor());
        return circle;
    }
}



