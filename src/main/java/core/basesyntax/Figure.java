package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {

    ColorSupplier colorSupplier = new ColorSupplier();
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = colorSupplier.getRandomColor();
    }

    public Figure(String color) {
        this.color = color;
    }
}
