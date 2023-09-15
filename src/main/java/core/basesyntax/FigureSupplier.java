package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANGE = 101;
    private static final int RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Type [] types = Type.values();
        Type figure = types[random.nextInt(types.length)];
        String randomColor = colorSupplier.getRandomColor();
        switch (figure) {
            case SQUARE: {
                return new Square(random.nextInt(RANGE),
                        randomColor);
            }
            case ISOSCELES_TRAPEZOID: {
                return new IsoscelesTrapezoid(random.nextInt(RANGE),
                        random.nextInt(RANGE), random.nextInt(RANGE),
                        randomColor);
            }
            case CIRCLE: {
                return new Circle(random.nextInt(RANGE),
                        randomColor);
            }
            case RESTANGLE: {
                return new Rectangle(random.nextInt(RANGE),random.nextInt(RANGE),
                        randomColor);
            }
            default: {
                return new RightTriangle(random.nextInt(RANGE),
                        random.nextInt(RANGE),
                        randomColor);
            }
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(RADIUS, Color.WHITE.name());
        return circle;
    }
}
