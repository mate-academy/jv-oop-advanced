package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    int figureType = random.nextInt(5);
    public static final int FIGURE_COUNT = 5;
    private static final Figure DEFAULT_FIGURE = new Circle(10, Colors.WHITE);

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);

        switch (figureType) {
            case 0:
                return new Square(random.nextDouble(),
                        colorSupplier.getRandomColor());
            case 1:
                return new Circle(random.nextDouble(),
                        colorSupplier.getRandomColor());
            case 2:
                return new IsoscelesTrapezoid(random.nextDouble(),
                        random.nextDouble(),
                        random.nextDouble(),
                        colorSupplier.getRandomColor());
            case 3:
                return new Rectangle(random.nextDouble(),
                        random.nextDouble(),
                        colorSupplier.getRandomColor());
            case 4:
                return new RightTriangle(random.nextDouble(),
                        random.nextDouble(),
                        colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return DEFAULT_FIGURE;
    }
}
