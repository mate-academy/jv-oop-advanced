package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE = 50;
    private static final int NUMBER_OF_FIGURE_TYPES = 5;
    private static final int DEFAULT_SIDE = 10;
    private final Random random;

    public FigureSupplier() {
        random = new Random();
    }

    private int getSide() {
        return random.nextInt(MAX_SIDE);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURE_TYPES);
        switch (index) {
            case 0: return new Circle(getSide());
            case 1: return new Square(getSide());
            case 2: return new Rectangle(getSide(), getSide());
            case 3: return new RightTriangle(getSide(), getSide());
            default: return new IsoscelesTrapezoid(getSide(), getSide(), getSide());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.getValue(), DEFAULT_SIDE);
    }
}
