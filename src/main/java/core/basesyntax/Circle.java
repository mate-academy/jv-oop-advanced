package core.basesyntax;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius,2));
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: "
                + ((int) (getArea() * 100) / 100.0)
                + " sq. units, radius: " + getRadius()
                + ", color: " + getColor());
    }
}
