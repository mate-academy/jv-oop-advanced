package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int CIRCLE_RADIUS = 10;
    private static final String CIRCLE_COLOR = "white";
    private final ColorSupplier colorSupplier;
    private Random random;

    public FigureSupplier(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    private int getRandomValue() {
        return new Random().nextInt(FIGURES_COUNT);
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_COUNT)) {
            case 1:
                return new RightTriangle(getRandomValue(),
                        getRandomValue(),
                        colorSupplier.getRandomColor());
            case 2:
                return new Circle(getRandomValue(),
                        colorSupplier.getRandomColor());
            case 3:
                return new IsoscelesTrapezoid(getRandomValue(),
                        getRandomValue(), getRandomValue(), colorSupplier.getRandomColor());
            case 4:
                return new Rectangle(getRandomValue(), getRandomValue(),
                        colorSupplier.getRandomColor());
            default:
                return new Square(getRandomValue(), colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_RADIUS, CIRCLE_COLOR);
    }
}
