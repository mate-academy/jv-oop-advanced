package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Figure: circle, area: "
                + getArea()
                + " sq. units, radius: "
                + radius
                + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
