package core.basesyntax;

public abstract class Figure {
    private String name;
    private String color;
    private double area;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void area();

    public abstract void info();

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }
}
