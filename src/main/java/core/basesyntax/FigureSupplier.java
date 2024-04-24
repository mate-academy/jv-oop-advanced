package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);

        return switch (figureType) {
            case 0 -> new Circle(colorSupplier.getRandomColor(), getRandomSize());
            case 1 -> new RightTriangle(colorSupplier.getRandomColor(), getRandomSize(),
                    getRandomSize());
            case 2 -> new Rectangle(colorSupplier.getRandomColor(), getRandomSize(),
                    getRandomSize());
            case 3 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    getRandomSize(),
                    getRandomSize(), getRandomSize());
            default -> new Square(colorSupplier.getRandomColor(), getRandomSize());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }

    private double getRandomSize() {
        return random.nextDouble();
    }
}
