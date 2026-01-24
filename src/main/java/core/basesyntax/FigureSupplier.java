package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MIN_PROPERTY_VALUE = 1;
    private static final int MAX_PROPERTY_VALUE = 20;
    private static final int FIGURES_COUNT = 5;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURES_COUNT);
        String color = colorSupplier.getRandomColor();

        double prop1 = MIN_PROPERTY_VALUE + (MAX_PROPERTY_VALUE - MIN_PROPERTY_VALUE)
                * random.nextDouble();
        double prop2 = MIN_PROPERTY_VALUE + (MAX_PROPERTY_VALUE - MIN_PROPERTY_VALUE)
                * random.nextDouble();
        double prop3 = MIN_PROPERTY_VALUE + (MAX_PROPERTY_VALUE - MIN_PROPERTY_VALUE)
                * random.nextDouble();

        switch (figureType) {
            case 0:
                return new Square(color, prop1);
            case 1:
                return new Rectangle(color, prop1, prop2);
            case 2:
                return new RightTriangle(color, prop1, prop2);
            case 3:
                return new Circle(color, prop1);
            case 4:
                double baseA = Math.min(prop1, prop2);
                double baseB = Math.max(prop1, prop2);
                return new IsoscelesTrapezoid(color, baseA, baseB, prop3);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10.0);
    }
}
