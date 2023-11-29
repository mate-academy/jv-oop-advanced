package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int CIRLE_RADIUS = 10;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (random.nextInt(FIGURE_COUNT)) {
            case (1):
                return new Circle(Math.abs(random.nextInt()), ColorSupplier.getRandomColor());
            case (2):
                return new Square(Math.abs(random.nextInt()), ColorSupplier.getRandomColor());
            case (3):
                return new IsoscelesTrapezoid(Math.abs(random.nextInt()),
                        Math.abs(random.nextInt()), Math.abs(random.nextInt()),
                        ColorSupplier.getRandomColor());
            case (4):
                return new RightTriangle(Math.abs(random.nextInt()), Math.abs(random.nextInt()),
                        ColorSupplier.getRandomColor());
            default:
                return new Rectangle(Math.abs(random.nextInt()), Math.abs(random.nextInt()),
                        ColorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRLE_RADIUS, Color.WHITE);
    }
}
