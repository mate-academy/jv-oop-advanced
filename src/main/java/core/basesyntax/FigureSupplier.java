package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final int BOUND = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    int randomSide;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public int getRandomSide() {
        return randomSide = random.nextInt(BOUND) + 1;
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);

        return switch (figureType) {
            case 0 -> new Square(colorSupplier.getRandomColor(), getRandomSide());
            case 1 -> new Rectangle(colorSupplier.getRandomColor(), getRandomSide(),
                    getRandomSide());
            case 2 -> new RightTriangle(colorSupplier.getRandomColor(), getRandomSide(), getRandomSide());
            case 3 -> new Circle(colorSupplier.getRandomColor(), getRandomSide());
            case 4 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomSide(),
                    getRandomSide(), random.nextInt(BOUND) + 1);
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
