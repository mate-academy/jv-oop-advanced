package core.basesyntax.figure;

import core.basesyntax.color.Color;
import core.basesyntax.color.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random(System.currentTimeMillis());
    private static final int RANDOM_MAX_VALUE = 100;

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), 10);
    }

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();

        Shape shape = Shape.values()[RANDOM.nextInt(Shape.values().length)];

        Figure figure;

        switch (shape) {
            case CIRCLE: {
                figure = new Circle(color, RANDOM.nextInt(RANDOM_MAX_VALUE));
                break;
            }
            case SQUARE: {
                figure = new Square(color, RANDOM.nextInt(RANDOM_MAX_VALUE));
                break;
            }
            case RECTANGLE: {
                figure = new Rectangle(color,RANDOM.nextInt(RANDOM_MAX_VALUE),
                        RANDOM.nextInt(RANDOM_MAX_VALUE));
                break;
            }
            case RIGHT_TRIANGLE: {
                figure = new RightTriangle(color, RANDOM.nextInt(RANDOM_MAX_VALUE),
                        RANDOM.nextInt(RANDOM_MAX_VALUE));
                break;
            }
            case ISOSCELES_TRAPEZOID: {
                figure = new IsoscelesTrapezoid(RANDOM.nextInt(RANDOM_MAX_VALUE),
                        RANDOM.nextInt(RANDOM_MAX_VALUE), RANDOM.nextInt(RANDOM_MAX_VALUE));
                break;
            }
            default: {
                figure = getDefaultFigure();
                break;
            }
        }

        return figure;
    }
}
