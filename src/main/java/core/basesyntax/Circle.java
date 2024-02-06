package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        setName(getClass().getSimpleName().toLowerCase());
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
        return (Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea() + " sq.units"
                + ", radius: " + radius + " units"
                + ", color: " + getColor());
    }
}
