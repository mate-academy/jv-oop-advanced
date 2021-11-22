package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable{
    private String color;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
