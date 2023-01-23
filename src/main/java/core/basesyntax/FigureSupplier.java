package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 100;
    private static final int FIGURE_COUNT = 5;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(BOUND));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),random.nextInt(BOUND),
                random.nextInt(BOUND));
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),random.nextInt(BOUND));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(BOUND), random.nextInt(BOUND));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(BOUND), random.nextInt(BOUND), random.nextInt(BOUND));
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0: return getRandomCircle();
            case 1: return getRandomRectangle();
            case 2: return getRandomSquare();
            case 3: return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
