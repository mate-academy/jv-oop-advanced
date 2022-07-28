package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RAND_VALUE = 50;
    private static final int CIRCLE_RADIUS = 10;

    public Figure getRandomFigure() {
        int index = new Random().nextInt(FIGURE_COUNT);
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (index) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), getRandomValue());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomValue());
            case 3:
                return new Circle(colorSupplier.getRandomColor(), getRandomValue());
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue(), getRandomValue());
        }
    }

    private int getRandomValue() {
        return new Random().nextInt(MAX_RAND_VALUE);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), CIRCLE_RADIUS);
    }
}
