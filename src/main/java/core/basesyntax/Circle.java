package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (radius * radius * Math.PI);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass()
                + ", area: " + this.getArea() + " sq. units,"
                + " radius: " + this.radius + " units, "
                + "color: " + this.getColor());
    }
}
