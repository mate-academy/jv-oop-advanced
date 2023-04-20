package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String randomColor = colorSupplier.getRandomColor();
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
