package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;

    protected Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Circle();
            case 1:
                return new Rectangle();
            case 2:
                return new Square();
            case 3:
                return new IsoscelesTrapezoid();
            case 4:
                return new RightTriangle();
            default:
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
