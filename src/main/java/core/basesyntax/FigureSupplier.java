package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final Random randomizer = new Random();
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_UNITS = 100;

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }

    public Figure getRandomFigure() {
        int figureIndex = randomizer.nextInt(FIGURE_COUNT);

        return switch (figureIndex) {
            case 0 -> new Circle(randomizer.nextInt(MAX_UNITS),
                    new ColorSupplier().getRandomColor());
            case 1 ->
                    new IsoscelesTrapezoid(randomizer.nextInt(MAX_UNITS),
                            randomizer.nextInt(MAX_UNITS),
                            randomizer.nextInt(MAX_UNITS),
                            new ColorSupplier().getRandomColor());
            case 2 ->
                    new Rectangle(randomizer.nextInt(MAX_UNITS),
                            randomizer.nextInt(MAX_UNITS),
                            new ColorSupplier().getRandomColor());
            case 3 ->
                    new RightTriangle(randomizer.nextInt(MAX_UNITS),
                            randomizer.nextInt(MAX_UNITS),
                            new ColorSupplier().getRandomColor());
            case 4 -> new Square(randomizer.nextInt(MAX_UNITS),
                    new ColorSupplier().getRandomColor());
            default -> getDefaultFigure();
        };
    }
}
