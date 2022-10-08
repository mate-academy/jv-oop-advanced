package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 4;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        Figure figure;
        switch (index) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), random.nextDouble());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble(),
                        random.nextDouble(),
                        random.nextDouble());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble(),
                        random.nextDouble());
            case 3:
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble());
            case 4:
            default:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble(),
                        random.nextDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
