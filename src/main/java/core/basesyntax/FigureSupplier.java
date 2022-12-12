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

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURE_TYPES);
        switch (index) {
            case 0: return new Circle(getRandomColor(), getSide());
            case 1: return new Square(getRandomColor(), getSide());
            case 2: return new Rectangle(getRandomColor(), getSide(), getSide());
            case 3: return new RightTriangle(getRandomColor(),getSide(), getSide());
            default: return new IsoscelesTrapezoid(getRandomColor(),
                    getSide(), getSide(), getSide());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_SIDE);
    }

    private int getSide() {
        return random.nextInt(MAX_SIDE);
    }

    private Color getRandomColor() {
        return colorSupplier.getRandomColor();
    }
}
