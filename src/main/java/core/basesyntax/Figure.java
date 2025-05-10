package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;
    private double area;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
