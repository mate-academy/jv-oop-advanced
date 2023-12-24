package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius,String name, String color) {
        super(name,color);
        this.radius = radius;
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

}
