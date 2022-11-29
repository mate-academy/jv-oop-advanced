package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        color = colorSupplier.getRandomColor();
        return color;
    }
}
