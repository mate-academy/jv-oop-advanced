package core.basesyntax.figure;

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
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("----------------------------"
                + "\n" + "Figure: circle"
                + "\n" + "Area: " + getArea() + " sq.units"
                + "\n" + "Radius: " + radius + " units"
                + "\n" + "Color: " + getColor()
                + "\n" + "----------------------------" + "\n");
    }
}
