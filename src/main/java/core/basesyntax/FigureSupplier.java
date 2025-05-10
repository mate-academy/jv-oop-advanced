package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_LENGT = 20;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureTipe.values().length);
        FigureTipe figure = FigureTipe.values()[index];
        switch (figure) {
            case CIRCLE: {
                return getRandomCircle();
            }
            case SQUARE: {
                return getRandomSquare();
            }
            case RIGHT_TRIANGLE: {
                return getRandomRightTriangle();
            }
            case RECTANGLE: {
                return getRandomRectangle();
            }
            default: {
                return getRandomIsoscelesTrapezoid();
            }
        }
    }

    public Figure getRandomRectangle() {
        return new Rectangle(random.nextInt(MAX_LENGT),random.nextInt(MAX_LENGT),
                colorSupplier.getRandomColor());
    }

    public Figure getRandomCircle() {
        return new Circle(random.nextInt(MAX_LENGT), colorSupplier.getRandomColor());
    }

    public Figure getRandomSquare() {
        return new Square(random.nextInt(MAX_LENGT), colorSupplier.getRandomColor());
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(MAX_LENGT), random.nextInt(MAX_LENGT),
                colorSupplier.getRandomColor());
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(MAX_LENGT),random.nextInt(MAX_LENGT),
                random.nextInt(MAX_LENGT), colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE);
    }
}
