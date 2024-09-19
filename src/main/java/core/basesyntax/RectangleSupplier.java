package core.basesyntax;

public class RectangleSupplier {
    private RandomGeometricValue randomSize = new RandomGeometricValue();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomRectangle() {
        return new Rectangle(randomSize.getRandomGeometricValue(),
                randomSize.getRandomGeometricValue(), colorSupplier.getRandomColor());
    }
}
