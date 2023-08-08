package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0: return new Square(random.nextDouble(), colorSupplier.getRandomColor());
            case 1: return new Rectangle(random.nextDouble(), random.nextDouble(),
                    colorSupplier.getRandomColor());
            case 2: return new Circle(random.nextDouble(), colorSupplier.getRandomColor());
            case 3: return new RightTriangle(random.nextDouble(), random.nextDouble(),
                    colorSupplier.getRandomColor());
            case 4: return new IsoscelesTrapezoid(random.nextDouble(), random.nextDouble(),
                    random.nextDouble(), colorSupplier.getRandomColor());
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
