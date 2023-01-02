package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_FIGURE_COUNTER_BOUND = 5;
    private static final int FIGURE_PARAMETERS_BOUND = 25;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(FIGURE_PARAMETERS_BOUND));
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(FIGURE_PARAMETERS_BOUND));
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_PARAMETERS_BOUND),
                random.nextInt(FIGURE_PARAMETERS_BOUND));
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_PARAMETERS_BOUND),
                random.nextInt(FIGURE_PARAMETERS_BOUND),
                random.nextInt(FIGURE_PARAMETERS_BOUND));
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_PARAMETERS_BOUND),
                random.nextInt(FIGURE_PARAMETERS_BOUND));
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(RANDOM_FIGURE_COUNTER_BOUND)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomRectangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle();
    }
}
