package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    public static final String default_color = "White";
    public static final int default_radius = 10;

    private String color;
    private double area;

    public Figure(String color) {
        this.color = color;
    }

    public static Figure getDefaultFigure() {
        return new Circle(default_color, default_radius);
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

    public void setArea(double area) {
        this.area = area;
    }
}
