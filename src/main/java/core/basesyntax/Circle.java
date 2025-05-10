package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle() {

    }

    public Circle(String color,double radius) {
        setColor(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        setArea(Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: "
                + getRadius() + ", color:" + getColor());
    }
}
