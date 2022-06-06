package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = String.valueOf(Color.WHITE);
    private static final int MAX_VALUE_SIDE = 50;
    private static final int MAX_FIGURE = 5;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int count = random.nextInt(MAX_FIGURE);
        switch (count) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(), random.nextInt());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextDouble(), random.nextDouble());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(), random.nextInt(), random.nextInt());
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt());
    }
}
