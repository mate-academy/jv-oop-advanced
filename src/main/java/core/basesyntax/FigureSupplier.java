package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String WHITE = Color.WHITE.name().toLowerCase();
    private static final int CIRCLE_DEFAULT_RADIUS = 10;
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 99;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[]{
                new Circle(colorSupplier.getRandomColor(), getRandomValue()),
                new Square(colorSupplier.getRandomColor(), getRandomValue()),
                new Rectangle(colorSupplier.getRandomColor(), getRandomValue(), getRandomValue()),
                new RightTriangle(colorSupplier.getRandomColor(), getRandomValue(),
                        getRandomValue()),
                new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomValue(),
                        getRandomValue(), getRandomValue())
        };
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE, CIRCLE_DEFAULT_RADIUS);
    }

    private int getRandomValue() {
        return random.nextInt(MAX_VALUE) + MIN_VALUE;
    }
}
