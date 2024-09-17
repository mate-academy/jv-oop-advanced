package core.basesyntax;

public class CircleSupplier {
    private static final RandomGeometricValue size = new RandomGeometricValue();
    private static final ColorSupplier color = new ColorSupplier();

    public Figure getRandomCircle() {
        return new Circle(size.getRandomGeometricValue(), color.getRandomColor());
    }
}
