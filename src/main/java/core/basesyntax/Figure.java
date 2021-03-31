package core.basesyntax;

public abstract class Figure {
    private String color = ColorSupplier.assignColor();
    private String property;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
