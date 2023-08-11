package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_INDEX = 5;
    private static final double MAX_UNITS = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(MAX_INDEX);
        switch (randomIndex) {
            case 0:
                return new Square(new ColorSupplier().getRandomColor(),
                                  random.nextDouble());
            case 1:
                return new Rectangle(new ColorSupplier().getRandomColor(),
                                     random.nextDouble(), random.nextDouble());
            case 2:
                return new Circle(new ColorSupplier().getRandomColor(),
                                  random.nextDouble());
            case 3:
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                                    random.nextDouble(), random.nextDouble());
            default:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                                     random.nextDouble(), random.nextDouble(),
                                     random.nextDouble(), random.nextDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
