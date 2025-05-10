package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color, String name) {
        super(color, name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq. units, radius: " + getRadius() + " units, color: " + getColor());
    }
}
