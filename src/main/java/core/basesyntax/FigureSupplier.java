package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10.0;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(RandomFigure.values().length);
        RandomFigure randomFigure = RandomFigure.values()[index];
        switch (randomFigure) {
            case CIRCLE:
                return new Circle(random.nextDouble(), new ColorSupplier().getRandomColor());
            case SQUARE:
                return new Square(random.nextDouble(), new ColorSupplier().getRandomColor());
            case RECTANGLE:
                return new Rectangle(random.nextDouble(), random.nextDouble(),
                        new ColorSupplier().getRandomColor());
            case RIGHTTRIANGLE:
                return new RightTriangle(random.nextDouble(), random.nextDouble(),
                        new ColorSupplier().getRandomColor());
            case ISOSCELESTRAPESOID:
                return new IsoscelesTrapezoid(random.nextDouble(), random.nextDouble(),
                        random.nextDouble(), new ColorSupplier().getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    protected Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }
}
