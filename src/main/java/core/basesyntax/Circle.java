package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private String name;

    public Circle(double radius, String name, String color) {
        super(color);
        this.radius = radius;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
