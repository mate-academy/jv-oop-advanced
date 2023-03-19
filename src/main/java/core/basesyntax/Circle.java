package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super.color = color;
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double circleArea = Math.PI * radius * radius;
        return circleArea;
    }

    @Override
    public void printInformation() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq.units, radius: " + radius + " units, color: " + color);
    }
}
