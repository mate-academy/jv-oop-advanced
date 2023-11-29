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
                return new Circle(random);
            case (2):
                return new Square(random);
            case (3):
                return new IsoscelesTrapezoid(random);
            case (4):
                return new RightTriangle(random);
            default:
                return new Rectangle(random);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRLE_RADIUS);
    }
}
