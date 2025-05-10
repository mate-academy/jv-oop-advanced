package core.basesyntax;

public class CircleSupplier {
    private RandomGeometricValue randomSize = new RandomGeometricValue();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomCircle() {
        return new Circle(randomSize.getRandomGeometricValue(), colorSupplier.getRandomColor());
    }
}
