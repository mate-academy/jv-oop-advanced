package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_VALUE = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private Random random;
    private ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_VALUE, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0: return getRandomIsoscelesTrapezoid();
            case 1: return getRandomCircle();
            case 2: return getRandomRightTriangle();
            case 3: return getRandomRectangle();
            default: return getRandomSquare();
        }
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(Figure.MAX_VALUE),
                random.nextInt(Figure.MAX_VALUE),
                random.nextInt(Figure.MAX_VALUE),
                colorSupplier.getRandomColor());
    }

    private Figure getRandomCircle() {
        return new Circle(random.nextInt(Figure.MAX_VALUE),
                colorSupplier.getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(Figure.MAX_VALUE),
                random.nextInt(Figure.MAX_VALUE),
                colorSupplier.getRandomColor());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(random.nextInt(Figure.MAX_VALUE),
                random.nextInt(Figure.MAX_VALUE),
                colorSupplier.getRandomColor());
    }

    private Figure getRandomSquare() {
        return new Square(random.nextInt(Figure.MAX_VALUE),
                colorSupplier.getRandomColor());
    }
}
