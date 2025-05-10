package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER_FIGURE = 5;
    private static final int MAX_SIZE = 10;
    private static final String DEFAULT_FIGURE_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    private int getRandomSize() {
        return random.nextInt(MAX_SIZE);
    }

    public Figure getRandomFigure() {
        int figure = random.nextInt(MAX_NUMBER_FIGURE);
        switch (figure) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomSize());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomSize(), getRandomSize(), getRandomSize());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomSize(),
                        getRandomSize());
            case 3:
                return new Square(colorSupplier.getRandomColor(), getRandomSize());
            default:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomSize(),
                        getRandomSize());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_RADIUS);
    }
}
