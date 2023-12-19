package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, radius: " + radius
                + " units, area: " + getArea()
                + " sq. units, color: " + this.getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
