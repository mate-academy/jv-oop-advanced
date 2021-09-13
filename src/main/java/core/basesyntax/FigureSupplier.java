package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                return new Square();
            case 2:
                return new Circle();
            case 3:
                return new IsoscelesTrapezoid();
            case 4:
                return new Rectangle();
            default:
                return new RightTriangle();
        }
    }
}
