package core.basesyntax;

public abstract class Figure implements Drawable {
    private String color;
    private double area;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
        this.area = calculateArea();
    }

    public abstract double calculateArea();
}
