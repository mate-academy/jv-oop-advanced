package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final Random RANDOM = new Random();
    public static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    public static final int FIGURES_COUNT = 5;
    public static final int MAX_BOUND = 100;

    public Figure getRandomFigure() {
        int shapeSelect = RANDOM.nextInt(FIGURES_COUNT);
        String colorSelect = COLOR_SUPPLIER.getRandomColor();

        switch (shapeSelect) {
            case 0:
                int side = RANDOM.nextInt(MAX_BOUND);
                return new Square(colorSelect, side);
            case 1:
                int base = RANDOM.nextInt(MAX_BOUND);
                int rightTriangleHeight = RANDOM.nextInt(MAX_BOUND);
                return new RightTriangle(colorSelect, base, rightTriangleHeight);
            case 2:
                int baseOne = RANDOM.nextInt(MAX_BOUND);
                int baseTwo = RANDOM.nextInt(MAX_BOUND);
                int isoscelesTrapezoidHeight = RANDOM.nextInt(MAX_BOUND);
                return new IsoscelesTrapezoid(colorSelect, baseOne, baseTwo,
                        isoscelesTrapezoidHeight);
            case 3:
                int rectangleHeight = RANDOM.nextInt(MAX_BOUND);
                int rectangleWidth = RANDOM.nextInt(MAX_BOUND);
                return new Rectangle(colorSelect, rectangleHeight, rectangleWidth);
            case 4:
                int radius = RANDOM.nextInt(MAX_BOUND);
                return new Circle(colorSelect, radius);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
