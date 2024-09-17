package core.basesyntax;

public class CircleSupplier {
    private static final RandomGeometricValue randomSize = new RandomGeometricValue();
    private static final ColorSupplier color = new ColorSupplier();

    public Figure getRandomCircle() {
        return new Circle(randomSize.getRandomGeometricValue(), color.getRandomColor());
    }
}
