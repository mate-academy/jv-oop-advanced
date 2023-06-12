package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (Math.PI * getRadius() * getRadius());
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: circle" + ", color: "
                +
                getColor() + ", radius: " + getRadius() + ", area: " + getArea());
    }
}
