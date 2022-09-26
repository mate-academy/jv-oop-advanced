package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int numberFigure = random.nextInt(5);
        switch (numberFigure) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRectangle();
            default:
                return getRandomRightTriangle();
        }
    }

    public Figure getRandomCircle() {
        return new Circle(random.nextDouble(), colorSupplier.getRandomColor().toLowerCase());
    }

    public Figure getRandomSquare() {
        return new Square(random.nextDouble(), colorSupplier.getRandomColor().toLowerCase());
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextDouble(), random.nextDouble(),
                random.nextDouble(), colorSupplier.getRandomColor().toLowerCase());
    }

    public Figure getRandomRectangle() {
        return new Rectangle(random.nextDouble(), random.nextDouble(),
                colorSupplier.getRandomColor().toLowerCase());
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(random.nextDouble(), random.nextDouble(),
                colorSupplier.getRandomColor().toLowerCase());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
