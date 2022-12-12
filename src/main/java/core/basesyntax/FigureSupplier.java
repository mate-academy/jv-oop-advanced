package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE = 50;
    private static final int NUMBER_OF_FIGURE_TYPES = 5;
    private static final int DEFAULT_SIDE = 10;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    private int getSide() {
        return random.nextInt(MAX_SIDE);
    }

    private String getColor() {
        return colorSupplier.getRandomColor();
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURE_TYPES);
        switch (index) {
            case 0: return new Circle(getColor(), getSide());
            case 1: return new Square(getColor(), getSide());
            case 2: return new Rectangle(getColor(), getSide(), getSide());
            case 3: return new RightTriangle(getColor(),getSide(), getSide());
            default: return new IsoscelesTrapezoid(getColor(), getSide(), getSide(), getSide());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.getValue(), DEFAULT_SIDE);
    }
}
