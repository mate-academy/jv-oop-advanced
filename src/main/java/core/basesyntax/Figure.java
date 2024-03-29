package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculate {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String color = colorSupplier.getRandomColor();

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
