package core.basesyntax;

public abstract class Shape implements Drawable, AreaFinder {
    private double area;
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
