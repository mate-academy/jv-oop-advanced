package core.basesyntax;

public class IsoscelesTrapezoidSupplier {
    private static final RandomGeometricValue size = new RandomGeometricValue();
    private static final ColorSupplier color = new ColorSupplier();

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(size.getRandomGeometricValue(),
                size.getRandomGeometricValue(), size.getRandomGeometricValue(),
                color.getRandomColor());
    }
}
