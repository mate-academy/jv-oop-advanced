package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        if (figureNumber == 0) {
            return new Circle();
        }
        if (figureNumber == 1) {
            return new RightTriangle();
        }
        if (figureNumber == 2) {
            return new Rectangle();
        }
        return new Square();
    }

    public Figure getDefaultFigure() {
        Circle defaultCircle = new Circle();
        defaultCircle.setColor("white");
        defaultCircle.setRadius(10);
        return defaultCircle;
    }
}
