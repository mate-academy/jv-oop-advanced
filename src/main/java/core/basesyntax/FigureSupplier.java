package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_COUNT = 5;
    private static final double DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        int number = new Random().nextInt(MAX_COUNT);
        ColorSupplier colorSupplier = new ColorSupplier();
        int index = new Random().nextInt(MAX_COUNT);

        switch (index) {
            case 0:
                return new Circle(number, colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(number, number, colorSupplier.getRandomColor());
            case 2:
                return new IsoscelesTrapezoid(number, number, number,
                        colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(number, number, colorSupplier.getRandomColor());
            case 4:
                return new Square(number, colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }
}
