package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int SIDE_LIMIT = 10;
    private static final int NUMBERS_OF_FIGURES = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(1, NUMBERS_OF_FIGURES);
        return switch (index) {
            case 1 -> new Square(getRandomSide(),
                    colorSupplier.getRandomColor());
            case 2 -> new RightTriangle(getRandomSide(), getRandomSide(),
                    colorSupplier.getRandomColor());
            case 3 -> new Circle(getRandomSide(),
                    colorSupplier.getRandomColor());
            case 4 -> new Rectangle(getRandomSide(), getRandomSide(),
                    colorSupplier.getRandomColor());
            case 5 -> new IsoscelesTrapezoid(getRandomSide(), getRandomSide(),
                    getRandomSide(), colorSupplier.getRandomColor());
            default -> getDefaultFigure();
        };
    }

    private int getRandomSide() {
        return random.nextInt(1, SIDE_LIMIT);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS,
                Color.WHITE.name().toLowerCase());
    }
}
