package core.basesyntax;

public abstract class Figure implements Behavior {

    private String name = this.getClass().getSimpleName().toLowerCase();
    private double area = 0.0;
    private String color;

    public Figure (String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor (String color) {
        this.color = color;
    }
}
