package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends AreaCalculator {

    private static final int FIGURE_COUNT = 5;
    private static final int MAX_NUMBER = 10;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);

        switch (index) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, MAX_NUMBER);
    }
}
