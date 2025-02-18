package core.basesyntax;

public class Circle extends Figure implements GetArea, Draw {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void print() {
        System.out.println("Figure: Circle, area: " + area() + " sq. units, " + "Radius: " + radius + ", Color: " + getColor());
    }
}
