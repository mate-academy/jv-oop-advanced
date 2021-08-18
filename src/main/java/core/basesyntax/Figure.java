package core.basesyntax;

public abstract class Figure implements Drawable {
    private static ColorSupplier supplier = new ColorSupplier();
    protected String color;

    public Figure() {
        this.color = supplier.getRandomColor();
    }

    public abstract double getArea();
}
