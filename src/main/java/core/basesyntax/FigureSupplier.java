package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();

    private Figure shape;

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        int i = random.nextInt(FigureType.values().length);

        switch (FigureType.values()[i]) {
            case CIRCLE:
                return getRandomCircle();
            case SQUARE:
                return getRandomSquare();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHT_TRIANGLE:
                return getRandomRightTriangle();
            case ISOSCELES_TRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
            random.nextInt(100));
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
            random.nextInt(100));
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
            random.nextInt(100),
            random.nextInt(100));
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
            random.nextInt(100),
            random.nextInt(100));
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
            random.nextInt(100),
            random.nextInt(100),
            random.nextInt(100));
    }

    public Figure getDefaultFigure() {
        final String defaultColor = Color.WHITE.toString().toLowerCase();
        final int defaultRadius = 10;
        return new Circle(defaultColor, defaultRadius);
    }
}
