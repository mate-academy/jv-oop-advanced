package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_COUNT = 4;
    private static final int MAX_RADIUS = 10;
    private final int index = new Random().nextInt(MAX_COUNT);
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (index) {
            case 0:
                return new Circle(new Random().nextInt(), colorSupplier.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(new Random().nextInt(), new Random().nextInt(),
                        new Random().nextInt(),
                        colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(new Random().nextInt(), new Random().nextInt(),
                        colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(new Random().nextInt(), new Random().nextInt(),
                        colorSupplier.getRandomColor());
            case 4:
                return new Square(new Random().nextInt(), colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(MAX_RADIUS, Color.WHITE);
    }
}
