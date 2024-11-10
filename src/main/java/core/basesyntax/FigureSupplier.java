package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int FIGURE_TYPES_COUNT = 5;  // Number of figure types
    private static final String[] COLORS = {"Red", "Blue", "Green", "Yellow", "Orange", "Purple", "Pink"}; // List of possible colors
    private final Random random = new Random();

    // Method to get a random color
    public String getRandomColor() {
        int index = random.nextInt(COLORS.length);  // Get a random index from the COLORS array
        return COLORS[index];
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_TYPES_COUNT);  // Randomly select a figure type

        return switch (index) {
            case 0 -> new Square(getRandomColor(), random.nextDouble() * 10);  // Use getRandomColor here
            case 1 -> new Rectangle(getRandomColor(), random.nextDouble() * 10, random.nextDouble() * 10);
            case 2 -> new RightTriangle(getRandomColor(), random.nextDouble() * 10, random.nextDouble() * 10);
            case 3 -> new Circle(getRandomColor(), random.nextDouble() * 10);
            case 4 ->
                    new IsoscelesTrapezoid(getRandomColor(), random.nextDouble() * 10, random.nextDouble() * 10, random.nextDouble() * 10);
            default -> null;
        };
    }

    // Method to return a default figure (white circle with radius 10)
    public Figure getDefaultFigure() {
        return new Circle("White", 10);  // Default color is white, default radius is 10
    }
}
