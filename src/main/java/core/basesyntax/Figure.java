package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    protected final String defaultColor = "WHITE";
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
