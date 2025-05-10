package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER_OF_FIGURE = 5;
    private static final int MAX_SIZE = 10;
    private static final int SIZE_CIRCLE = 10;
    private static final String COLOR_CIRCLE = Color.WHITE.name();
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public int getRandomSize() {
        return random.nextInt(MAX_SIZE);
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_NUMBER_OF_FIGURE)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomSize());
            case 1:
                return new Square(colorSupplier.getRandomColor(), getRandomSize());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomSize(),
                        getRandomSize());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomSize(),
                        getRandomSize());
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomSize(),
                        getRandomSize(),
                        getRandomSize());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR_CIRCLE,SIZE_CIRCLE);
    }
}
