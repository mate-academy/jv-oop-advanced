package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MIN_LENGTH_OF_SIDE = 1;
    private static final int MAX_LENGTH_OF_SIDE = 7;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int size = 5;
        switch (size) {
            case 0:
                return new Rectangle(colorSupplier.getColor(),
                        getRandomSizeOfSide(), getRandomSizeOfSide());
            case 1:
                return new Circle(colorSupplier.getColor(), getRandomSizeOfSide());
            case 2:
                return new Square(colorSupplier.getColor(), getRandomSizeOfSide());
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getColor(),
                        getRandomSizeOfSide(), getRandomSizeOfSide(),
                        getRandomSizeOfSide());
            case 4:
                return new RightTriangle(colorSupplier.getColor(),
                        getRandomSizeOfSide(), getRandomSizeOfSide());
            default:
                return getDefaultFigure();

        }
    }

    private int getRandomSizeOfSide() {
        return MIN_LENGTH_OF_SIDE + random.nextInt(MAX_LENGTH_OF_SIDE);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

}
