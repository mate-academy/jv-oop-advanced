package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM_NUMBER = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = RANDOM_NUMBER.nextInt(Figures.values().length);
        return switch (Figures.values()[index]) {
            case CIRCLE -> new Circle(RANDOM_NUMBER.nextInt(100), colorSupplier.getRandomColor());
            case SQUARE -> new Square(RANDOM_NUMBER.nextInt(100), colorSupplier.getRandomColor());
            case RECTANGLE -> new Rectangle(RANDOM_NUMBER.nextInt(100),
                    RANDOM_NUMBER.nextInt(100), colorSupplier.getRandomColor());
            case RIGHT_TRIANGLE -> new RightTriangle(RANDOM_NUMBER.nextInt(100),
                    RANDOM_NUMBER.nextInt(100), colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(RANDOM_NUMBER.nextInt(100),
                    RANDOM_NUMBER.nextInt(100), RANDOM_NUMBER.nextInt(100),
                    colorSupplier.getRandomColor());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }

    public Figure[] fillArray(Figure[] figures) {
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = getDefaultFigure();
        }
        return figures;
    }
}
