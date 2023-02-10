package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM = 30;
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT);
    }

    public Figure getRandomFigure() {
        int randomize = random.nextInt(FIGURE_COUNT) + 1;
        switch (randomize) {
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(RANDOM));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(RANDOM), random.nextInt(RANDOM));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(RANDOM),
                        random.nextInt(RANDOM));
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(RANDOM), random.nextInt(RANDOM), random.nextInt(RANDOM));
            case 5:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(RANDOM));
            default:
                return null;
        }
    }
}
