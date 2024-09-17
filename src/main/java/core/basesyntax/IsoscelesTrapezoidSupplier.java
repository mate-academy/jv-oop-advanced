package core.basesyntax;

public class IsoscelesTrapezoidSupplier {
    private static final RandomGeometricValue randomSize = new RandomGeometricValue();
    private static final ColorSupplier color = new ColorSupplier();

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(randomSize.getRandomGeometricValue(),
                randomSize.getRandomGeometricValue(), randomSize.getRandomGeometricValue(),
                color.getRandomColor());
    }
}
