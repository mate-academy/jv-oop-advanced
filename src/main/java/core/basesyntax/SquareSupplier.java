package core.basesyntax;

public class SquareSupplier {
    private static final RandomGeometricValue size = new RandomGeometricValue();
    private static final ColorSupplier color = new ColorSupplier();

    public Figure getRandomSquare() {
        return new Square(size.getRandomGeometricValue(), color.getRandomColor());
    }
}
