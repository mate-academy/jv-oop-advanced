package core.basesyntax;

public class RectangleSupplier {
    private static final RandomGeometricValue randomSize = new RandomGeometricValue();
    private static final ColorSupplier color = new ColorSupplier();

    public Figure getRandomRectangle() {
        return new Rectangle(randomSize.getRandomGeometricValue(),
                randomSize.getRandomGeometricValue(), color.getRandomColor());
    }
}
