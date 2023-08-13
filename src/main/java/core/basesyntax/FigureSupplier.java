package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int COUNT_OF_FIGURE = 5;
    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_RADIUS = 10;
    private static Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(COUNT_OF_FIGURE)) {
            case 0: return createCircle();
            case 1: return createRightTriangle();
            case 2: return createSquare();
            case 3: return createRectangle();
            case 4: return createIsoscelesTrapezoid();
            default: return createSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure createCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextDouble());
    }

    private Figure createRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextDouble(),
                random.nextDouble());
    }

    private Figure createSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextDouble());
    }

    private Figure createRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextDouble(),
                random.nextDouble());
    }

    private Figure createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextDouble(),
                random.nextDouble(),
                random.nextDouble());
    }

}
