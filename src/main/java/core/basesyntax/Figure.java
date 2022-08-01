package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;
    private double area;

    public Figure() {
    }

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
