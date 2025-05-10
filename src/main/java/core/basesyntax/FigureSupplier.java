package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);

        switch (figureType) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextDouble());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble(),
                        random.nextDouble());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble(),
                        random.nextDouble());
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextDouble());
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble(),
                        random.nextDouble(),
                        random.nextDouble());
            default:
                return new Circle("white", 10);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
