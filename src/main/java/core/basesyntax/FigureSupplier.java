package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int LENGTH_MAX = 20;
    private static final int FIGURE_AMOUNT = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public int createLength() {
        Random random = new Random();
        return random.nextInt(LENGTH_MAX);
    }

    public Figure createFigure() {
        Random random = new Random();
        int number = random.nextInt(FIGURE_AMOUNT);
        switch (number) {
            case 0:
                return new Circle(colorSupplier.generateColor(), createLength());
            case 1:
                return new RightTriangle(colorSupplier.generateColor(), createLength(),
                        createLength());
            case 2:
                return new Square(colorSupplier.generateColor(),
                        createLength());
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.generateColor(),
                        createLength(), createLength(), createLength());
            default:
                return new Rectangle(colorSupplier.generateColor(),
                        createLength(), createLength());
        }
    }
}
