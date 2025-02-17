package core.basesyntax;

public class Circle extends Figure implements GetArea, Draw {
    private double radius;
    private double area = Math.PI * radius * radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return area;
    }

    @Override
    public void print() {
        System.out.println("Figure: Circle, area: " + area() + " sq. units, " + "Radius: " + radius + ", Color: " + getColor());
    }
}
