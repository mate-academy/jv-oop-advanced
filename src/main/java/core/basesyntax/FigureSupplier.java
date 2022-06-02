package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_COUNT);
        switch (figureIndex) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
                return getRandomSquare();
            default:
                return getRandomRightTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, colorSupplier.getRandomColor());
    }

    private Figure getRandomCircle() {
        return new Circle(random.nextDouble(), colorSupplier.getRandomColor());
    }

    private Figure getRandomSquare() {
        return new Square(random.nextDouble(), colorSupplier.getRandomColor());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(random.nextDouble(), random.nextDouble(),
                colorSupplier.getRandomColor());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(random.nextDouble(), random.nextDouble(),
                colorSupplier.getRandomColor());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextDouble(),
                random.nextDouble(), random.nextDouble(),
                colorSupplier.getRandomColor());
    }
}
