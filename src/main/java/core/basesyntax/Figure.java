package core.basesyntax;

public abstract class Figure implements AreaCalculator, Draw {
    private String color;

    public void setColor() {
        ColorSupplier color = new ColorSupplier();
        this.color = color.getRandomColor();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
