package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double RADIUS = 10.0;
    private static final int MAX_VALUE = 20;
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(5);
        switch (index) {
            case 1:
                return new Square(supplier.getRandomColor(),random.nextInt(MAX_VALUE));
            case 2:
                return new RightTriangle(supplier.getRandomColor(),random.nextInt(MAX_VALUE),random.nextInt(MAX_VALUE));
            case 3:
                return new Rectangle(supplier.getRandomColor(),random.nextInt(MAX_VALUE),random.nextInt(MAX_VALUE));
            case 4:
                return new IsoscelesTrapezoid(supplier.getRandomColor(),random.nextInt(MAX_VALUE),random.nextInt(MAX_VALUE),random.nextInt(MAX_VALUE));
            default:
                return new Circle(supplier.getRandomColor(),random.nextInt(MAX_VALUE));
        }
    }
    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE,10);
    }
}
