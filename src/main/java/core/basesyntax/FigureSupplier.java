package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final int RANDOM_INDEX = 50;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEFAULT_RADIUS = 10;

    private int getRandom() {
        return RANDOM.nextInt(RANDOM_INDEX);
    }

    public Figure getRandomFigure() {
        int index = RANDOM.nextInt(5);

        switch (index) {
            case 0:
                return new Circle(COLOR_SUPPLIER.getRandomColor(), getRandom());
            case 1:
                return new RightTriangle(COLOR_SUPPLIER.getRandomColor(), getRandom(), getRandom());
            case 2:
                return new IsoscelesTrapezoid(COLOR_SUPPLIER.getRandomColor(), getRandom(),
                        getRandom(), getRandom());
            case 3:
                return new Rectangle(COLOR_SUPPLIER.getRandomColor(), getRandom(), getRandom());
            case 4:
                return new Square(COLOR_SUPPLIER.getRandomColor(), getRandom());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
        circle.setColor(Color.WHITE.toString().toLowerCase());
        return circle;
    }
}
