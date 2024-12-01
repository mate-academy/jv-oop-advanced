package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random2 = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random2.nextInt(5)) {
            case 0:
                return new Square(COLOR_SUPPLIER.getColorSupplier(), random2.nextDouble() * 10 + 1);
            case 1:
                return new Rectangle(COLOR_SUPPLIER.getColorSupplier(), random2.nextDouble()
                        * 10 + 1, random2.nextDouble() * 10 + 1);
            case 2:
                return new RightTriangle(COLOR_SUPPLIER.getColorSupplier(), random2.nextDouble()
                        * 10 + 1, random2.nextDouble() * 10 * 1);
            case 3:
                return new Circle(COLOR_SUPPLIER.getColorSupplier(), random2.nextDouble() * 10 + 1);
            default:
                return new IsoscelesTrapezoid(COLOR_SUPPLIER.getColorSupplier(),random2.nextDouble()
                        * 10 + 1, random2.nextDouble() * 10 + 1, random2.nextDouble() * 10 + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
