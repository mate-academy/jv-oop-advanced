package core.basesyntax;

public class Figure implements Drawable,AreaMeasurable {
    private final ColorSupplier supplier = new ColorSupplier();

    public ColorSupplier getSupplier() {
        return supplier;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
