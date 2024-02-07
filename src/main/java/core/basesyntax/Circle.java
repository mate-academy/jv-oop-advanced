package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double obtainTheArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + obtainTheArea()
                + " sq.units, radius: " + this.radius
                + " units, color: " + super.getColor().toLowerCase());
    }
}
