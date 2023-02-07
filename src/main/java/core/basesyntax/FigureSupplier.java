package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final int MAX_LENGT = 20;
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (FigureTipe.values()[RANDOM.nextInt(FigureTipe.values().length)]) {
            case CIRCLE: {
                return new Circle(RANDOM.nextInt(MAX_LENGT), COLOR_SUPPLIER.getRandomColor());
            }
            case SQUARE: {
                return new Square(RANDOM.nextInt(MAX_LENGT), COLOR_SUPPLIER.getRandomColor());
            }
            case RIGHT_TRIANGLE: {
                return new RightTriangle(RANDOM.nextInt(MAX_LENGT), RANDOM.nextInt(MAX_LENGT),
                        COLOR_SUPPLIER.getRandomColor());
            }
            case RECTANGLE: {
                return new Rectangle(RANDOM.nextInt(MAX_LENGT),RANDOM.nextInt(MAX_LENGT),
                        COLOR_SUPPLIER.getRandomColor());
            }
            default: {
                return new IsoscelesTrapezoid(RANDOM.nextInt(MAX_LENGT),RANDOM.nextInt(MAX_LENGT),
                        RANDOM.nextInt(MAX_LENGT), COLOR_SUPPLIER.getRandomColor());
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
