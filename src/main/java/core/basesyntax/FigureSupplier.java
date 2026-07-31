package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final Random RANDOM = new Random();
    public static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    final int figuresCount;
    final int maxBound;

    public FigureSupplier() {
        figuresCount = 5;
        maxBound = 100;
    }

    public Figure getRandomFigure() {
        int shapeSelect = RANDOM.nextInt(figuresCount);
        String colorSelect = COLOR_SUPPLIER.getRandomColor();

        switch (shapeSelect) {
            case 0:
                int side = RANDOM.nextInt(maxBound);
                return new Square(colorSelect, side);
            case 1:
                int base = RANDOM.nextInt(maxBound);
                int rightTriangleHeight = RANDOM.nextInt(maxBound);
                return new RightTriangle(colorSelect, base, rightTriangleHeight);
            case 2:
                int baseOne = RANDOM.nextInt(maxBound);
                int baseTwo = RANDOM.nextInt(maxBound);
                int isoscelesTrapezoidHeight = RANDOM.nextInt(maxBound);
                return new IsoscelesTrapezoid(colorSelect, baseOne, baseTwo,
                        isoscelesTrapezoidHeight);
            case 3:
                int rectangleHeight = RANDOM.nextInt(maxBound);
                int rectangleWidth = RANDOM.nextInt(maxBound);
                return new Rectangle(colorSelect, rectangleHeight, rectangleWidth);
            case 4:
                int radius = RANDOM.nextInt(maxBound);
                return new Circle(colorSelect, radius);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
