package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final int MAX_LENGTH = 100;
    private static final int FIGURE_COUNT = 5;

    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = String.valueOf(Color.GREEN);

    public GeometricFigure getRandomFigure() {
        final String randomColor = COLOR_SUPPLIER.getRandomColor();
        final int index = RANDOM.nextInt(FIGURE_COUNT);
        final int randomProperty = RANDOM.nextInt(MAX_LENGTH);
        switch (index) {
            case 0:
                return new Circle(randomProperty, randomColor);
            case 1:
                return new IsoscelesTrapezoid(randomProperty, randomProperty,
                        randomProperty, randomColor);
            case 2:
                return new Rectangle(randomProperty, randomProperty, randomColor);
            case 3:
                return new RightTriangle(randomProperty, randomProperty, randomColor);
            default:
                return new Square(randomProperty, randomColor);
        }
    }

    public GeometricFigure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
