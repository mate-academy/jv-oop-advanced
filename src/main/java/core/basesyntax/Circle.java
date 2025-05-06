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

    @Override
    public void draw() {
        System.out.println("Figure: "
                + this.type.name().toLowerCase()
                + ", area: "
                + (Math.PI * Math.pow(radius, 2))
                + " units, radius: "
                + radius
                + " units, color: "
                + this.color.name().toLowerCase());
    }
}
