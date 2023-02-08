package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_LENGT = 20;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (FigureTipe.values()[random.nextInt(FigureTipe.values().length)]) {
            case CIRCLE: {
                return new Circle(random.nextInt(MAX_LENGT), colorSupplier.getRandomColor());
            }
            case SQUARE: {
                return new Square(random.nextInt(MAX_LENGT), colorSupplier.getRandomColor());
            }
            case RIGHT_TRIANGLE: {
                return new RightTriangle(random.nextInt(MAX_LENGT), random.nextInt(MAX_LENGT),
                        colorSupplier.getRandomColor());
            }
            case RECTANGLE: {
                return new Rectangle(random.nextInt(MAX_LENGT),random.nextInt(MAX_LENGT),
                        colorSupplier.getRandomColor());
            }
            default: {
                return new IsoscelesTrapezoid(random.nextInt(MAX_LENGT),random.nextInt(MAX_LENGT),
                        random.nextInt(MAX_LENGT), colorSupplier.getRandomColor());
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
