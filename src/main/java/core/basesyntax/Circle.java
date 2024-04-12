package core.basesyntax;

public class Circle extends Figure {
    protected double radius;

    public Circle(double radius, String name, String color) {
        super(color, name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getName() + ", area: " + getArea()
                + " sq. units, radius: " + radius + " units, color " + this.getColor());
    }
}
