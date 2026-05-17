package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_SIZE = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random randomizer = new Random();

    public Figure getRandomFigure() {
        Figures[] availableFigures = Figures.values();
        Figures randomFigure = availableFigures[randomizer.nextInt(availableFigures.length)];
        String randomColor = colorSupplier.getRandomColor();

        switch (randomFigure) {
            case CIRCLE: {
                return new Circle(randomColor, randomizer.nextInt(MAX_FIGURE_SIZE));
            }
            case RECTANGLE: {
                return new Rectangle(randomColor,
                        randomizer.nextInt(MAX_FIGURE_SIZE),
                        randomizer.nextInt(MAX_FIGURE_SIZE)
                );
            }
            case RIGHT_TRIANGLE: {
                return new RightTriangle(randomColor,
                        randomizer.nextInt(MAX_FIGURE_SIZE),
                        randomizer.nextInt(MAX_FIGURE_SIZE)
                );
            }
            case ISOSCELES_TRAPEZOID: {
                return new IsoscelesTrapezoid(randomColor,
                        randomizer.nextInt(MAX_FIGURE_SIZE),
                        randomizer.nextInt(MAX_FIGURE_SIZE),
                        randomizer.nextInt(MAX_FIGURE_SIZE)
                );
            }
            default: {
                return new Square(randomColor, randomizer.nextInt(MAX_FIGURE_SIZE));
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), 10);
    }
}
