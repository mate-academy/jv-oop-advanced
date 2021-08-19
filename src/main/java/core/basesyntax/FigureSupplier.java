package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int RANDOM_RANGE = 40;

    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureRandom = random.nextInt(FIGURE_COUNT);
        switch (figureRandom) {
            case 0:
                return new Circle(random.nextInt(RANDOM_RANGE));
            case 1:
                return new IsoscelesTrapezoid(random.nextInt(RANDOM_RANGE),
                        random.nextInt(RANDOM_RANGE),
                        random.nextInt(RANDOM_RANGE));
            case 2:
                return new Rectangle(random.nextInt(RANDOM_RANGE),
                        random.nextInt(RANDOM_RANGE));
            case 3:
                return new RightTriangle(random.nextInt(RANDOM_RANGE),
                        random.nextInt(RANDOM_RANGE));
            default:
                return new Square(random.nextInt(RANDOM_RANGE));
        }
    }
}
