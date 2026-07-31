package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final Random RANDOM = new Random();
    public static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private final int figuresCount;
    private final int maxBound;

    public FigureSupplier() {
        figuresCount = 5;
        maxBound = 100;
    }

    public int getFiguresCount() {
        return figuresCount;
    }

    public int getMaxBound() {
        return maxBound;
    }

    public Figure getRandomFigure() {
        int shapeSelect = RANDOM.nextInt(getFiguresCount());
        String colorSelect = COLOR_SUPPLIER.getRandomColor();

        switch (shapeSelect) {
            case 0:
                int side = RANDOM.nextInt(getMaxBound());
                return new Square(colorSelect, side);
            case 1:
                int base = RANDOM.nextInt(getMaxBound());
                int rightTriangleHeight = RANDOM.nextInt(getMaxBound());
                return new RightTriangle(colorSelect, base, rightTriangleHeight);
            case 2:
                int baseOne = RANDOM.nextInt(getMaxBound());
                int baseTwo = RANDOM.nextInt(getMaxBound());
                int isoscelesTrapezoidHeight = RANDOM.nextInt(getMaxBound());
                return new IsoscelesTrapezoid(colorSelect, baseOne, baseTwo,
                        isoscelesTrapezoidHeight);
            case 3:
                int rectangleHeight = RANDOM.nextInt(getMaxBound());
                int rectangleWidth = RANDOM.nextInt(getMaxBound());
                return new Rectangle(colorSelect, rectangleHeight, rectangleWidth);
            case 4:
                int radius = RANDOM.nextInt(getMaxBound());
                return new Circle(colorSelect, radius);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
