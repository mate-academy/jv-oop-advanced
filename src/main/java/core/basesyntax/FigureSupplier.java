package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_AMOUNT = 5;
    private static final double RANDOM_PROPERTIES = 25;
    private static final double DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();
    private Figure figure;

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_AMOUNT)) {
            case 0:
                figure = new Square(supplier.getRandomColor(), RANDOM_PROPERTIES);
                break;
            case 1:
                figure = new Circle(supplier.getRandomColor(), RANDOM_PROPERTIES);
                break;
            case 2:
                figure = new RightTriangle(supplier.getRandomColor(),
                        RANDOM_PROPERTIES, RANDOM_PROPERTIES);
                break;
            case 3:
                figure = new IsoscelesTrapezoid(supplier.getRandomColor(), RANDOM_PROPERTIES,
                        RANDOM_PROPERTIES, RANDOM_PROPERTIES);
                break;
            case 4:
                figure = new Rectangle(supplier.getRandomColor(), RANDOM_PROPERTIES,
                        RANDOM_PROPERTIES);
                break;
            default:
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return figure = new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}
