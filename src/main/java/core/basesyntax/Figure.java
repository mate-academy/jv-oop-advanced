package core.basesyntax;

public class Figure implements Drawable, AreaCalculator {
    private String color;
    private double area;

    public Figure(String color, double area) {
        this.color = color;
        this.area = area;
    }

    public Figure(String color) {
        this.color = color;
    }

    public Figure() {
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void draw() {
    }
}

