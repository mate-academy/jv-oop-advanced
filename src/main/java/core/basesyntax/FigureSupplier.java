package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Square();
            case 1:
                return new Circle();
            case 2:
                return new Triangle();
            case 3:
                return new Trapezoid();
            default:
                return new Square();
        }
    }
}
