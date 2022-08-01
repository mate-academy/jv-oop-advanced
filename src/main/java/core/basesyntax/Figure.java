package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;
    private double area;

    public Figure() {
    }

    public Figure(String color, double area) {
        this.color = color;
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }
}
