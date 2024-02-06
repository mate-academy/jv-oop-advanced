package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    public static final int MAX_SIDE = 9;
    public static final int FIGURE_COUNT = 5;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        int randomNum = random.nextInt(MAX_SIDE);
        switch (index) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), randomNum);
            case 1:
                return new Square(colorSupplier.getRandomColor(), randomNum);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), randomNum, randomNum);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), randomNum, randomNum);
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomNum, randomNum, randomNum);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
