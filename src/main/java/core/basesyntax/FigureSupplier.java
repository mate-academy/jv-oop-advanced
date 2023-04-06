package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(Figure.values().length);
        Figure randomFigure = Figure.values()[index];
        switch (randomFigure) {
            case CIRCLE:
                return new Circle(random.nextDouble(), new ColorSupplier().getRandomColor());
            case SQUARE:
                return new Square(random.nextDouble(), new ColorSupplier().getRandomColor());
            case RECTANGLE:
                return new Rectangle(random.nextDouble(), random.nextDouble(),
                        new ColorSupplier().getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(random.nextDouble(), random.nextDouble(),
                        new ColorSupplier().getRandomColor());
            case ISOSCELES_TRAPESOID:
                return new IsoscelesTrapezoid(random.nextDouble(), random.nextDouble(),
                        random.nextDouble(), new ColorSupplier().getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
