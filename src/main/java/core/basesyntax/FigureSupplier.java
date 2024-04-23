package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE = 5;
    private static final int SIDE_LENGTH = 10;
    private static final int DEFAULT_RADIUS = 10;
    private ColorSupplier supplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(NUMBER_OF_FIGURE);
        String color = supplier.getRandomColor();
        int randomSide = getRandomSide();

        return switch (randomFigure) {
            case 0 -> new Circle(randomSide, color);
            case 1 -> new Square(randomSide, color);
            case 2 -> new Rectangle(randomSide, randomSide, color);
            case 3 -> new RightTriangle(randomSide, randomSide, color);
            case 4 -> new IsoscelesTrapezoid(randomSide, randomSide, randomSide, color);
            default -> new IsoscelesTrapezoid(randomSide, randomSide, randomSide, color);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WITE.name());
    }

    private int getRandomSide() {
        return random.nextInt(SIDE_LENGTH + 1);
    }
}
