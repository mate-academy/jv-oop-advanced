package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0: return createSquare();
            case 1: return createRectangle();
            case 2: return createCircle();
            case 3: return createRightTriangle();
            case 4: return createIsoscelesTrapezoid();
            default: return getDefaultFigure();
        }
    }

    private Figure createSquare() {
        return new Square(random.nextDouble(), colorSupplier.getRandomColor());
    }

    private Figure createRectangle() {
        return new Rectangle(random.nextDouble(), random.nextDouble(),
                colorSupplier.getRandomColor());
    }

    private Figure createCircle() {
        return new Circle(random.nextDouble(), colorSupplier.getRandomColor());
    }

    private Figure createRightTriangle() {
        return new RightTriangle(random.nextDouble(), random.nextDouble(),
                colorSupplier.getRandomColor());
    }

    private Figure createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextDouble(), random.nextDouble(),
                random.nextDouble(), colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
