package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_COUNT = 4;
    private static final int MAX_RADIUS = 10;
    private Random rnd = new Random();
    private final int index = new Random().nextInt(MAX_COUNT);
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (index) {
            case 0:
                return new Circle(rnd.nextInt(), colorSupplier.getRandomColor().toString());
            case 1:
                return new IsoscelesTrapezoid(rnd.nextInt(),rnd.nextInt(),
                        rnd.nextInt(),
                        colorSupplier.getRandomColor().toString());
            case 2:
                return new Rectangle(rnd.nextInt(), rnd.nextInt(),
                        colorSupplier.getRandomColor().toString());
            case 3:
                return new RightTriangle(rnd.nextInt(), rnd.nextInt(),
                        colorSupplier.getRandomColor().toString());
            case 4:
                return new Square(rnd.nextInt(), colorSupplier.getRandomColor().toString());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(MAX_RADIUS, Color.WHITE.toString());
    }
}
