package core.basesyntax;

public class Circle extends Figure {
    private static final String name = "circle";
    protected double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea()
                + " sq. units, radius: " + radius + " units, color " + this.getColor());
    }
}
