package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURES_AMOUNT = 5;
    public static final int MAX_RANDOM_NUMBER = 50;
    public static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random rand = new Random();

    public Figure getRandomFigure() {
        int choice = rand.nextInt(FIGURES_AMOUNT);
        String randColor = colorSupplier.getRandomColor();
        double value1 = rand.nextDouble() * MAX_RANDOM_NUMBER;
        double value2 = rand.nextDouble() * MAX_RANDOM_NUMBER;
        double value3 = rand.nextDouble() * MAX_RANDOM_NUMBER;
        return switch (choice) {
            case 1 -> new IsoscelesTrapezoid(randColor, value1, value2, value3);
            case 2 -> new Rectangle(randColor, value1, value2);
            case 3 -> new RightTriangle(randColor, value1, value2);
            case 4 -> new Square(randColor, value1);
            default -> new Circle(randColor, value1);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(colorSupplier.getDefaultColor(), DEFAULT_RADIUS);
    }
}
