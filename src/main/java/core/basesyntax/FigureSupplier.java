package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANGE = 100;
    private static final int RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Type [] types = Type.values();
        Type figure = types[random.nextInt(types.length)];
        Color randomColor = colorSupplier.getRandomColor();
        switch (figure) {
            case SQUARE: {
                return new Square(random.nextInt(RANGE) + 1,
                        randomColor);
            }
            case ISOSCELES_TRAPEZOID: {
                return new IsoscelesTrapezoid(random.nextInt(RANGE) + 1,
                        random.nextInt(RANGE) + 1, random.nextInt(RANGE) + 1,
                        randomColor);
            }
            case CIRCLE: {
                return new Circle(random.nextInt(RANGE) + 1,
                        randomColor);
            }
            case RESTANGLE: {
                return new Rectangle(random.nextInt(RANGE) + 1,random.nextInt(RANGE) + 1,
                        randomColor);
            }
            default: {
                return new RightTriangle(random.nextInt(RANGE) + 1,
                        random.nextInt(RANGE) + 1,
                        randomColor);
            }
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(RADIUS, Color.WHITE);
        return circle;
    }
}
