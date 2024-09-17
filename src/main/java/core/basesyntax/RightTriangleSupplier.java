package core.basesyntax;

public class RightTriangleSupplier {
    private static final RandomGeometricValue size = new RandomGeometricValue();
    private static final ColorSupplier color = new ColorSupplier();

    public Figure getRandomRightTriangle() {
        return new RightTriangle(size.getRandomGeometricValue(),
                size.getRandomGeometricValue(), color.getRandomColor());
    }
}
