package core.basesyntax;

public class RectangleSupplier {
    private static final RandomGeometricValue size = new RandomGeometricValue();
    private static final ColorSupplier color = new ColorSupplier();

    public Figure getRandomRectangle() {
        return new Rectangle(size.getRandomGeometricValue(),
                size.getRandomGeometricValue(), color.getRandomColor());
    }
}
