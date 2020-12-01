package core.basesyntax;

public abstract class Figure {

    public double area;
    public String color;

    public Figure(double area, String color) {
        this.area = area;
        this.color = color;
    }

    public abstract void draw();

    public double getArea() {
        return area;
    }

}
