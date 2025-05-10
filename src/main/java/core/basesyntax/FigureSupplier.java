package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT_FIGURES = 5;
    private static final int LENGTH = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int n = random.nextInt(AMOUNT_FIGURES);
        switch (n + 1) {
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(LENGTH));
            case 2:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(LENGTH));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(LENGTH), random.nextInt(LENGTH));
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(LENGTH), random.nextInt(LENGTH));
            case 5:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(100), random.nextInt(LENGTH), random.nextInt(LENGTH));
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(colorSupplier.getRandomColor(), 10);
    }
}
