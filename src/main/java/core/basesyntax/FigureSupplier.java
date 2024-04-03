package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    private double generateRandomValue() {
        return (random.nextInt(10000) + 1) / 100.0;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), generateRandomValue());
            case 1:
                return new Circle(colorSupplier.getRandomColor(), generateRandomValue());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        generateRandomValue(), generateRandomValue());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        generateRandomValue(), generateRandomValue());
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        generateRandomValue(), generateRandomValue(), generateRandomValue());
            default:
                return new Circle("Black", 1.0);
        }
    }

    public Figure getDefaultFigure() {
        return new Square("White", 10);
    }
}
