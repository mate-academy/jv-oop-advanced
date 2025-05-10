package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5; // Визначили константу для кількості фігур
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int side = random.nextInt(10) + 1;
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), side);
            case 1:
                int width = random.nextInt(10) + 1;
                int height = random.nextInt(10) + 1;
                return new Rectangle(colorSupplier.getRandomColor(), width, height);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), side, side);
            case 3:
                return new Circle(colorSupplier.getRandomColor(), side);
            default:
                int base = random.nextInt(10) + 1;
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), side, side, base);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
