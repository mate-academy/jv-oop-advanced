package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int RANDOM_SIDE = 10;
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRundomFigure() {
        String color = supplier.getRandomColor();
        int randomFigure = random.nextInt(FIGURE_NUMBER);
        int randomSide = getRandomSide();
        return switch (randomFigure) {
            case 0 -> new Circle(randomSide, color);
            case 1 -> new IsoscelesTrapezoid(randomSide, randomSide, randomSide, color);
            case 2 -> new Rectangle(randomSide, randomSide, color);
            case 3 -> new RightTriangle(randomSide, randomSide, color);
            case 4 -> new Square(randomSide, color);
            default -> new Square(randomSide, color);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }

    private int getRandomSide() {
        return random.nextInt(RANDOM_SIDE + 1);
    }
}
