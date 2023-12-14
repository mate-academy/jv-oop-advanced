package core.basesyntax;

public abstract class Figure {
    private double area;
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract void draw();

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void calculateArea();

    public void setArea(double area) {
        this.area = area;
    }
}
