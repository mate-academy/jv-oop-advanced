package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int amountOfFigureTypes = 5;
    private static final int figureSideBounds = 100;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        final int minIndex = 1;
        int index = random.nextInt(amountOfFigureTypes) + minIndex;
        switch (index) {
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(figureSideBounds) + minIndex);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(figureSideBounds) + minIndex,
                        random.nextInt(figureSideBounds) + minIndex);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(figureSideBounds) + minIndex);
            case 4:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(figureSideBounds) + minIndex);
            case 5:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(figureSideBounds) + minIndex,
                        random.nextInt(figureSideBounds) + minIndex,
                        random.nextInt(figureSideBounds) + minIndex);
            default:
                throw new IllegalArgumentException("Invalid figure index: " + index);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
