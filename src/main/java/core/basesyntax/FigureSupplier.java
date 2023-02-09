package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR;
    private static final int DEFAULT_VALUE;
    private static final int NUMBER_OF_FIGURES;
    private Random random;
    private ColorSupplier colorSupplier;

    static {
        DEFAULT_COLOR = Color.WHITE.name();
        DEFAULT_VALUE = 10;
        NUMBER_OF_FIGURES = 5;
    }

    public FigureSupplier() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_VALUE, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        Figure figure = null;
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0: figure = getRandomIsoscelesTrapezoid();
            break;
            case 1: figure = getRandomCircle();
            break;
            case 2: figure = getRandomRightTriangle();
            break;
            case 3: figure = getRandomRectangle();
            break;
            default: figure = getRandomSquare();
        }
        return figure;
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
