package core.basesyntax;

public class RightTriangleSupplier {
    private RandomGeometricValue randomSize = new RandomGeometricValue();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomRightTriangle() {
        return new RightTriangle(randomSize.getRandomGeometricValue(),
                randomSize.getRandomGeometricValue(), colorSupplier.getRandomColor());
    }
}
