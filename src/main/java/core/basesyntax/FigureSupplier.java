package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER_FIGURE = 5;
    private static final int MAX_SIZE = 10;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    private int getRandomSize() {
        return random.nextInt(MAX_SIZE);
    }

    public Figure getRandomFigure() {
        int figure = random.nextInt(MAX_NUMBER_FIGURE);
        return (figure == 1) ? new Circle(colorSupplier.getRandomColor(), getRandomSize())
                : (figure == 2) ? new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomSize(), getRandomSize(), getRandomSize())
                : (figure == 3) ? new RightTriangle(colorSupplier.getRandomColor(),
                getRandomSize(), getRandomSize())
                : (figure == 4) ? new Square(colorSupplier.getRandomColor(), getRandomSize())
                : new Rectangle(colorSupplier.getRandomColor(), getRandomSize(), getRandomSize());
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
