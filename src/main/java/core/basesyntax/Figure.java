package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private double area;
    String color;

    public void draw() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
