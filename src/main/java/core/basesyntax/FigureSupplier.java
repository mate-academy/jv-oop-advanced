package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIZE = 50;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), getRandomSize());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomSize(), getRandomSize());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomSize(), getRandomSize());
            case 3:
                return new Circle(colorSupplier.getRandomColor(), getRandomSize());
            default:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        getRandomSize(),
                        getRandomSize(),
                        getRandomSize()
                );
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
    private int getRandomSize() {
        return random.nextInt(MAX_SIZE) + 1;
    }
}
