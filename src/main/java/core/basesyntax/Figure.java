package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;
    private final String name;
    private double area;

    protected Figure(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColor() {
        return color.toLowerCase();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name.toLowerCase();
    }

}
