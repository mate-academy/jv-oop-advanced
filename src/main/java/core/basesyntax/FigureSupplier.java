package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int FIGURE_PARAMETERS_COUNT = 10;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomTriangle();
            case 4:
                return getRandomCircle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.toString().toLowerCase(), 10);
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_PARAMETERS_COUNT));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_PARAMETERS_COUNT),
                random.nextInt(FIGURE_PARAMETERS_COUNT));
    }

    private Figure getRandomTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_PARAMETERS_COUNT),
                random.nextInt(FIGURE_PARAMETERS_COUNT));
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_PARAMETERS_COUNT));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(FIGURE_PARAMETERS_COUNT),
                random.nextInt(FIGURE_PARAMETERS_COUNT),
                random.nextInt(FIGURE_PARAMETERS_COUNT));
    }
}
