package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 100;
    private static final int DEFAULT_RADIUS = 100;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final int quantityOfFigures = 5;

    public Figure getRandomFigure() {
        return switch (random.nextInt(quantityOfFigures)) {
            case (0) -> getCircle();
            case (1) -> getIsoscelesTrapezoid();
            case (2) -> getSquare();
            case (3) -> getRectangle();
            case (4) -> getRightTriangle();
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextDouble(BOUND));
    }

    private Figure getSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextDouble(BOUND));
    }

    private Figure getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(BOUND),
                random.nextDouble(BOUND));
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(BOUND),
                random.nextDouble(BOUND), random.nextDouble(BOUND));
    }

    private Figure getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble(BOUND),
                random.nextDouble(BOUND));
    }
}
