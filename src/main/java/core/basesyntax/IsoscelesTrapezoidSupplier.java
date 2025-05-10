package core.basesyntax;

public class IsoscelesTrapezoidSupplier {
    private RandomGeometricValue randomSize = new RandomGeometricValue();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(randomSize.getRandomGeometricValue(),
                randomSize.getRandomGeometricValue(), randomSize.getRandomGeometricValue(),
                colorSupplier.getRandomColor());
    }
}
