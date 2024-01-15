package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int FIGURES_QUANTITY = 4;
    private static final int RANDOM_BOUND = 100;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURES_QUANTITY);
        switch (randomFigure) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomCircle() {
        return new Circle(supplier.getRandomColor(),random.nextInt(RANDOM_BOUND));
    }

    private Figure getRandomSquare() {
        return new Square(supplier.getRandomColor(), random.nextInt(RANDOM_BOUND));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(supplier.getRandomColor(), random.nextInt(RANDOM_BOUND),
                random.nextInt(RANDOM_BOUND));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(supplier.getRandomColor(),
                    random.nextInt(RANDOM_BOUND),
                    random.nextInt(RANDOM_BOUND));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(supplier.getRandomColor(),
                    random.nextInt(RANDOM_BOUND),
                    random.nextInt(RANDOM_BOUND),
                    random.nextInt(RANDOM_BOUND));
    }
}


