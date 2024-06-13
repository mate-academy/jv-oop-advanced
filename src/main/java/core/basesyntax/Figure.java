package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    public static final String DEFAULT_COLOR = "White";
    public static final int DEFAULT_RADIUS = 10;

    private String color;
    private double area;

    public Figure(String color) {
        this.color = color;
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
