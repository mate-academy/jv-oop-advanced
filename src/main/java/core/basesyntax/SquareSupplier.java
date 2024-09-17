package core.basesyntax;

public class SquareSupplier {
    private static final RandomGeometricValue randomSize = new RandomGeometricValue();
    private static final ColorSupplier color = new ColorSupplier();

    public Figure getRandomSquare() {
        return new Square(randomSize.getRandomGeometricValue(), color.getRandomColor());
    }
}
