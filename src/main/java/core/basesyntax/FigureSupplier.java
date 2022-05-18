package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_SIDE_LENGTH = 10;
    public static final int MIN_SIDE_LENGTH = 1;
    public static final int DEFAULT_LENGTH = 10;
    public static final String DEFAULT_FIGURE_COLOR = Color.WHITE.name();
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        double side1 = random.nextInt((MAX_SIDE_LENGTH - MIN_SIDE_LENGTH) + 1) + MIN_SIDE_LENGTH;
        double side2 = random.nextInt((MAX_SIDE_LENGTH - MIN_SIDE_LENGTH) + 1) + MIN_SIDE_LENGTH;
        switch (index) {
            case 1:
                return new Square(colorSupplier.getRandomColor(), side1);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), side1, side2);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),side1, side2);
            case 4:
                return new Circle(colorSupplier.getRandomColor(), side1);
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), side1, side2, side2);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_LENGTH);
    }
}
