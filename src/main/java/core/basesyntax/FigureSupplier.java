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
        int index = random.nextInt(amountOfFigureTypes) + 1;
        switch (index) {
            case 1:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(figureSideBounds) + 1);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(figureSideBounds) + 1,
                        random.nextInt(figureSideBounds) + 1);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(figureSideBounds) + 1);
            case 4:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(figureSideBounds) + 1);
            case 5:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(figureSideBounds) + 1,
                        random.nextInt(figureSideBounds) + 1,
                        random.nextInt(figureSideBounds) + 1);
            default:
                throw new IllegalArgumentException("Illegal figure");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR.toString(), DEFAULT_RADIUS);
    }
}
