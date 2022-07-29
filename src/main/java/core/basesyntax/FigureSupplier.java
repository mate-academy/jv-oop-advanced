package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int RANDOM_NUMBER = 20;
    private static final int RANDOM_RADIUS = 10;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(RANDOM_NUMBER));
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(RANDOM_NUMBER),
                        random.nextInt(RANDOM_NUMBER),
                        random.nextInt(RANDOM_NUMBER));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(RANDOM_NUMBER),
                        random.nextInt(RANDOM_NUMBER));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(RANDOM_NUMBER),
                        random.nextInt(RANDOM_NUMBER));
            case 4:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(RANDOM_NUMBER));
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(RANDOM_NUMBER));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), RANDOM_RADIUS);
    }
}
