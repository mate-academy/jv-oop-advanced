package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 4;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(10) + 1);
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(10) + 1);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(10) + 1);
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        + random.nextInt(10) + 1,
                        + random.nextInt(10) + 1, random.nextInt(10) + 1);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.ORANGE, 10);
    }
}
