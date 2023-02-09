package core.basesyntax;

public abstract class Figure implements Drawable {
    protected String color;
    private ColorSupplier colorSuppliers;

    public Figure(ColorSupplier colorSuppliers) {
        this.colorSuppliers = colorSuppliers;
        this.color = this.colorSuppliers.getRandomColor();
    }

    public Figure(String color) {
        this.colorSuppliers = new ColorSupplier();
        this.color = color;
    }
}
