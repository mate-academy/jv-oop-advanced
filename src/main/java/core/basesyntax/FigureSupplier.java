package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }

    public Figure getRandomFigure() {
        int typeFigure = random.nextInt(FIGURE_COUNT);
        switch (typeFigure) {
            case 0:
                return new Square();
            case 1:
                return new Circle();
            case 2:
                return new IsoscelesTrapezoid();
            case 3:
                return new Rectangle();
            case 4:
                return new RightTriangle();
            default:
                return getDefaultFigure();
        }
    }
}
