package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private String name;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String name, String color) {
        this.radius = radius;
        this.name = name;
        this.color = color;
    }

    public void printInfo() {
        System.out.println("Figure: " + getName()
                + ", " + "area: " + calculateArea()
                + ", " + "radius: " + getRadius()
                + ", " + "color: " + getColor());

    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }
}
