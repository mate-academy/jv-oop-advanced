package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAGIC_NUMBER = 100;
    private static final int FIGURE_COUNT = 5;

    public Figure getRandomFigure() {
        final String randomColor = colorSupplier.getRandomColor();
        final int index = random.nextInt(FIGURE_COUNT);
        final int randomProperty = random.nextInt(MAGIC_NUMBER);
        final int randomProperty1 = random.nextInt(MAGIC_NUMBER);
        final int randomProperty2 = random.nextInt(MAGIC_NUMBER);

        switch (index) {
            case 0:
                return new Circle(randomProperty, randomColor);
            case 1:
                return new IsoscelesTrapezoid(randomProperty, randomProperty1,
                        randomProperty2, randomColor);
            case 2:
                return new Rectangle(randomProperty, randomProperty1, randomColor);
            case 3:
                return new RightTriangle(randomProperty, randomProperty1, randomColor);
            default:
                return new Square(randomProperty, randomColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
