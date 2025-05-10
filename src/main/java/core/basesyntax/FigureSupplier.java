package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_FIGURES = 5;
    public static final int MAX_RANDOM_SIDE_VALUE = 100;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        var figureType = random.nextInt(MAX_FIGURES);
        Color color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Circle(color, getSize());
            case 1:
                return new Square(color, getSize());
            case 2:
                return new Rectangle(color, getSize(), getSize());
            case 3:
                return new RightTriangle(color, getSize(), getSize());
            default:
                return new IsoscelesTrapezoid(color, getSize(), getSize(), getSize());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    private int getSize() {
        return random.nextInt(MAX_RANDOM_SIDE_VALUE);
    }
}
