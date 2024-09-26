package core.basesyntax;

public abstract class Figure implements Drawing {
    private String name;
    private String color;
    private double area;

    public Figure(String name, double area, String color) {
        this.name = name;
        this.area = area;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", " + "area: " + getArea()
                + ", " + "color: " + getColor());
    }
}
