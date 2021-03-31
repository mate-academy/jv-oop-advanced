package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int LENGTH_MAX = 20;
    private static final int FIGURE_AMOUNT = 5;

    public int createLength() {
        Random random = new Random();
        return random.nextInt(LENGTH_MAX);
    }

    public Figure createFigure() {
        Random random = new Random();
        int number = random.nextInt(FIGURE_AMOUNT);
        switch (number) {
            case 0:
                return new Circle(ColorSupplier.chooseColor(), createLength());
            case 1:
                return new RightTriangle(ColorSupplier.chooseColor(), createLength(),
                        createLength());
            case 2:
                return new Square(ColorSupplier.chooseColor(),
                        createLength());
            case 3:
                return new IsoscelesTrapezoid(ColorSupplier.chooseColor(),
                        createLength(), createLength(), createLength());
            default:
                return new Rectangle(ColorSupplier.chooseColor(),
                        createLength(), createLength());
        }
    }
}
