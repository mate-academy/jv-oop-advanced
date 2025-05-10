package core.basesyntax;

public abstract class Figure implements Drawable, AreaMeasurable {
    protected ColorSupplier supplier;

    public Figure() {
        this.supplier = new ColorSupplier();
    }

    public ColorSupplier getSupplier() {
        return supplier;
    }

}
