package core.basesyntax;

public class SquareSupplier {
    private RandomGeometricValue randomSize = new RandomGeometricValue();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomSquare() {
        return new Square(randomSize.getRandomGeometricValue(), colorSupplier.getRandomColor());
    }
}
