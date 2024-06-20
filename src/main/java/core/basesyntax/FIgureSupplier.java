package core.basesyntax;

import java.util.Random;

public class FIgureSupplier {
    private static final int NUMBER_OF_FIGURE_TYPES = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURE_TYPES);
        Color color = colorSupplier.getRandomColor();

        return switch (figureType) {
            case 0 -> new Square(color,
                    getRandomSize());
            case 1 -> new Rectangle(color,
                    getRandomSize(), getRandomSize());
            case 2 -> new Circle(color,
                    getRandomSize());
            case 3 -> new RightTriangle(color,
                    getRandomSize(), getRandomSize());
            case 4 -> new IsoscelesTrapezoid(color,
                    getRandomSize(), getRandomSize(), getRandomSize());
            default -> getDefaultFigure();
        };
    }

    private double getRandomSize() {
        return random.nextDouble();
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
