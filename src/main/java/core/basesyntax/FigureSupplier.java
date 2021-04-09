package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_PROPERTY_VALUE = 20;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int figure = random.nextInt(FIGURE_COUNT);
        switch (figure) {
            case 0:
                return new Circle("Circle", colorSupplier.getRandomColor(),
                        random.nextInt(MAX_PROPERTY_VALUE));
            case 1:
                return new IsoscelesTrapezoid("IsoscelesTrapezoid", colorSupplier.getRandomColor(),
                        random.nextInt(MAX_PROPERTY_VALUE), random.nextInt(MAX_PROPERTY_VALUE),
                        random.nextInt(MAX_PROPERTY_VALUE));
            case 2:
                return new Rectangle("Rectangle", colorSupplier.getRandomColor(),
                        random.nextInt(MAX_PROPERTY_VALUE), random.nextInt(MAX_PROPERTY_VALUE));
            case 3:
                return new RightTriangle("RightTriangle", colorSupplier.getRandomColor(),
                        random.nextInt(MAX_PROPERTY_VALUE), random.nextInt(MAX_PROPERTY_VALUE));
            default:
                return new Square("Square", colorSupplier.getRandomColor(),
                        random.nextInt(MAX_PROPERTY_VALUE));
        }
    }
}
