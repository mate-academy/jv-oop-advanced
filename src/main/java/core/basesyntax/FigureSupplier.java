package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_COUNT = 4;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private final int index = new Random().nextInt(MAX_COUNT);
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (index) {
            case 0:
                return new Circle(random.nextInt(), colorSupplier.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(random.nextInt(),random.nextInt(),
                        random.nextInt(),
                        colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(random.nextInt(), random.nextInt(),
                        colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(random.nextInt(), random.nextInt(),
                        colorSupplier.getRandomColor());
            case 4:
                return new Square(random.nextInt(), colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }
}
