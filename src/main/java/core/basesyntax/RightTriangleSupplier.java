package core.basesyntax;

public class RightTriangleSupplier {
    private static final RandomGeometricValue randomSize = new RandomGeometricValue();
    private static final ColorSupplier color = new ColorSupplier();

    public Figure getRandomRightTriangle() {
        return new RightTriangle(randomSize.getRandomGeometricValue(),
                randomSize.getRandomGeometricValue(), color.getRandomColor());
    }
}
