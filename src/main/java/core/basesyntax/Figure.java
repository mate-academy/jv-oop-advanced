package core.basesyntax;

public abstract class Figure implements Drawable {
    private String color;
    private double area;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public abstract void calculateArea();
}
