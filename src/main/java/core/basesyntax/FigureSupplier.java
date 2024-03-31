package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        final int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return new Square(color, getRandomValue());
            case 1:
                return new Rectangle(color, getRandomValue(), getRandomValue());
            case 2:
                return new RightTriangle(color, getRandomValue(), getRandomValue());
            case 3:
                return new Circle(color, getRandomValue());
            case 4:
                return new IsoscelesTrapezoid(color, getRandomValue(),
                        getRandomValue(), getRandomValue());
            default:
                throw new IllegalStateException("Unexpected value: " + figureType);
        }

    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private double getRandomValue() {
        return random.nextDouble() * 10 + 1;
    }
}
