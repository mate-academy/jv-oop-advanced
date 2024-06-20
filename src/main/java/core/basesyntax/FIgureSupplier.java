package core.basesyntax;

import java.util.Random;

public class FIgureSupplier {
    private static final int NUMBER_OF_FIGURE_TYPES = 5;
    private static final int DEFAULT_FIGURE_COUNT = 6;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double DEFAULT_RADIUS = 10.0;
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
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure[] generateFigures() {
        Figure[] figures = new Figure[DEFAULT_FIGURE_COUNT];
        for (int i = 0; i < DEFAULT_FIGURE_COUNT; i++) {
            if (i < DEFAULT_FIGURE_COUNT / 2) {
                figures[i] = getRandomFigure();
            } else {
                figures[i] = getDefaultFigure();
            }
            figures[i].draw();
        }
        return figures;
    }
}
