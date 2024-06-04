package core.basesyntax;

import static core.basesyntax.ColorSupplier.RANDOM;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MIN_LENGTH = 2;
    private static final int MAX_LENGTH = 10;

    public Figure getRandomFigure() {
        int ran = RANDOM.nextInt(FIGURE_COUNT);
        int a = RANDOM.nextInt(MAX_LENGTH + 1);
        int b = RANDOM.nextInt(MAX_LENGTH + 1);
        int c = RANDOM.nextInt(MAX_LENGTH + 1);
        switch (ran) {
            case (0):
                return new Square(a);
            case (1):
                return new Rectangle(a, b);
            case (2):
                return new RightTriangle(a, b);
            case (3):
                return new Circle(a, Color.WHITE);
            default:
                return new IsoscelesTrapezoid(a, b, c);
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
