package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPE_QUANTITY = 5;
    private static final int MAX_DIMENSION = 25;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        if (random.nextInt(FIGURE_TYPE_QUANTITY) == 1) {
            return new Circle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_DIMENSION));
        }
        if (random.nextInt(FIGURE_TYPE_QUANTITY) == 2) {
            return new IsolateTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_DIMENSION));
        }
        if (random.nextInt(FIGURE_TYPE_QUANTITY) == 3) {
            return new Rectangle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_DIMENSION), random.nextInt(MAX_DIMENSION));
        }
        if (random.nextInt(FIGURE_TYPE_QUANTITY) == 4) {
            return new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(MAX_DIMENSION), random.nextInt(MAX_DIMENSION));
        }
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_DIMENSION));
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }
}
