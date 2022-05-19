package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIZE = 10;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public int getRandomSize() {
        return random.nextInt(MAX_SIZE);
    }

    public Figure getRandomFigure() {
        int figure = random.nextInt(FIGURE_COUNT);
        switch (figure) {
            case 0 : return new Circle("WHITE", 10);
            case 1 : return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomSize(),
                    getRandomSize(), getRandomSize());
            case 2 : return new Rectangle(colorSupplier.getRandomColor(), getRandomSize(),
                    getRandomSize());
            case 3 : return new RightTriangle(colorSupplier.getRandomColor(), getRandomSize(),
                    getRandomSize());
            case 4 :
            default:
                return new Square(colorSupplier.getRandomColor(), getRandomSize());
        }
    }
}
