package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_DOUBLE = 20.5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int switchCaseInt = 5;
    private final double defaultDouble = 10;
    private final Color defaultColor = Color.WHITE;

    private double getRandomDouble(double max) {
        return random.nextDouble() * max;
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(switchCaseInt);
        Color color = colorSupplier.getRandomColor();
        double side = getRandomDouble(MAX_DOUBLE);
        double side2 = getRandomDouble(MAX_DOUBLE);
        double side3 = getRandomDouble(MAX_DOUBLE);
        switch (figureType) {
            case 0:
                return new Square(
                        side,
                        color
                );
            case 1:
                return new Circle(
                        side,
                        color
                );
            case 2:
                return new Rectangle(
                        side,
                        side2,
                        color
                );
            case 3:
                return new RightTriangle(
                        side,
                        side2,
                        color
                );
            case 4:
                return new IsoscelesTrapezoid(
                        side,
                        side2,
                        side3,
                        color
                );
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultDouble, defaultColor);
    }
}
