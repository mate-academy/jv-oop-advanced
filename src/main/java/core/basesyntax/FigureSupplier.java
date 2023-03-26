package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_COUNT = 4;
    private static final int MAX_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(MAX_COUNT);
        switch (index) {
            case 0:
                return new Circle(new Random().nextInt(), colorSupplier.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(new Random().nextInt(), new Random().nextInt(), new Random().nextInt(), colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(new Random().nextInt(), new Random().nextInt(), colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(new Random().nextInt(), new Random().nextInt(), colorSupplier.getRandomColor());
            default:
                return new Square(new Random().nextInt(), colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(MAX_RADIUS, Color.WHITE);
    }
}
