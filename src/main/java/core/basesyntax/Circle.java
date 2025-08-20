package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + this.getArea() + " sq. units, radius: "
                + this.radius + " units, color: " + this.getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
