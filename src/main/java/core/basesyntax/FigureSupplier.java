package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public AbstractFigure getRandomFigure() {
        int figureType = RANDOM.nextInt(5);
        String color = COLOR_SUPPLIER.getRandomColor();
        switch (figureType) {
            case 0:
                return new Circle(color, RANDOM.nextDouble(1, 20));
            case 1:
                return new Square(color, RANDOM.nextDouble(1, 20));
            case 2:
                return new Rectangle(color, RANDOM.nextDouble(1, 20), RANDOM.nextDouble(1, 20));
            case 3:
                return new RightTriangle(color, RANDOM.nextDouble(1, 20), RANDOM.nextDouble(1, 20));
            default:
                return new IsoscelesTrapezoid(color, RANDOM.nextDouble(1, 20), RANDOM.nextDouble(1, 20), RANDOM.nextDouble(1, 20));
        }
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
