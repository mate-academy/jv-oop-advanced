package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIDE_VALUE = 100;
    private static final int MIN_SIDE_VALUE = 1;
    private static final int DEFAULT_SIZE = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 1:
                return new Square(getRandomSide(), colorSupplier.getRandomColor());
            case 2:
                return new Circle(getRandomSide(), colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(getRandomSide(), getRandomSide(),
                        getRandomSide(), colorSupplier.getRandomColor());
            case 4:
                return new Rectangle(getRandomSide(),
                        getRandomSide(), colorSupplier.getRandomColor());
            case 5:
                return new IsoscelesTrapezoid(getRandomSide(), getRandomSide(),
                        getRandomSide(), colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_SIZE, DEFAULT_COLOR);
    }

    private int getRandomSide() {
        return random.nextInt((MAX_SIDE_VALUE - MIN_SIDE_VALUE) + 1) + 1;
    }
}
