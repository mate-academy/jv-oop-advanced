package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;
    private ColorSupplier supplier = new ColorSupplier();

    public Figure() {
        this.color = supplier.getRandomColor();
    }

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
