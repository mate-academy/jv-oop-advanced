package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String[] figures = {
            "Circle",
            "Rectangle",
            "Square",
            "Right Triangle",
            "Isosceles Trapezoid"
    };
    private static final int MAX_LENGTH = 11;
    private static final int FIGURE_COUNT = figures.length;
    // Array with random numbers of max 3, because
    // that's the maximum numbers that Isosceles Trapezoid can use.
    private static final int RANDOM_LENGTHS_COUNT = 3;
    private int[] randomLengths = new int[RANDOM_LENGTHS_COUNT];
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        String chosenFigure = figures[random.nextInt(FIGURE_COUNT)];
        String color = colorSupplier.getRandomColor();

        for (int i = 0; i < RANDOM_LENGTHS_COUNT; i++) {
            randomLengths[i] = random.nextInt(MAX_LENGTH);
        }

        return switch (chosenFigure) {
            case "Circle" -> new Circle(randomLengths[0], color);
            case "Rectangle" -> new Rectangle(randomLengths[0], randomLengths[1], color);
            case "Square" -> new Square(randomLengths[0], color);
            case "Right Triangle" -> new RightTriangle(randomLengths[0], randomLengths[1], color);
            default -> new IsoscelesTrapezoid(randomLengths[0],
                    randomLengths[1],
                    randomLengths[2],
                    color);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
