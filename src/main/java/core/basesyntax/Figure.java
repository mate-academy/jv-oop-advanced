package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculate {
    private String color = ColorSupplier.assignColor();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
