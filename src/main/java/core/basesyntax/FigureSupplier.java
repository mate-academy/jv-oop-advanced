package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPE_COUNT = 5;
    private static final double MIN_PROPERTY_VALUE = 1.0;
    private static final double MAX_PROPERTY_VALUE = 20.0;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = "white";

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int figureType = random.nextInt(FIGURE_TYPE_COUNT);


        double randomProp1 = MIN_PROPERTY_VALUE + (MAX_PROPERTY_VALUE - MIN_PROPERTY_VALUE) * random.nextDouble();
        double randomProp2 = MIN_PROPERTY_VALUE + (MAX_PROPERTY_VALUE - MIN_PROPERTY_VALUE) * random.nextDouble();
        double randomProp3 = MIN_PROPERTY_VALUE + (MAX_PROPERTY_VALUE - MIN_PROPERTY_VALUE) * random.nextDouble();

        switch (figureType) {
            case 0:
                return new Square(randomColor, randomProp1);
            case 1:
                return new Rectangle(randomColor, randomProp1, randomProp2);
            case 2:
                return new RightTriangle(randomColor, randomProp1, randomProp2);
            case 3:
                return new Circle(randomColor, randomProp1);
            case 4:
                return new IsoscelesTrapezoid(randomColor, randomProp1, randomProp2, randomProp3);
            default:
                return getDefaultFigure();
        }
    }
}