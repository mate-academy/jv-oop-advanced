package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = RANDOM.nextInt(5);
        String color = COLOR_SUPPLIER.getRandomColorSupplier();
        switch (figureType) {
            case 0:
                return new Square(color, RANDOM.nextDouble() * 10 + 1);
            case 1:
                return new Circle(color, RANDOM.nextDouble() * 10 + 1);
            case 2:
                return new IsoscelesTrapezoid(color, RANDOM.nextDouble() * 10 + 1, RANDOM.nextDouble() * 10 + 1, RANDOM.nextDouble() * 10 + 1);
            case 3:
                return new Rectangle(color, RANDOM.nextDouble() * 10 + 1, RANDOM.nextDouble() * 10 + 1);
            case 4:
                return new RightTriangle(color, RANDOM.nextDouble() * 10 + 1, RANDOM.nextDouble() * 10 + 1 );
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}