package core.basesyntax;

public abstract class Figure implements Drawable {
    private double area;
    private String color;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract double calculateArea();

}
