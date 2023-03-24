package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_COUNT = 4;
    private static final int MAX_RADIUS = 10;

    public Figure getRandomFigure() {
        int index = new Random().nextInt(MAX_COUNT);
        switch (index) {
            case 0:
                return new Circle();
            case 1:
                return new IsoscelesTrapezoid();
            case 2:
                return new Rectangle();
            case 3:
                return new RightTriangle();
            default:
                return new Square();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(MAX_RADIUS, Color.WHITE);
    }
}
