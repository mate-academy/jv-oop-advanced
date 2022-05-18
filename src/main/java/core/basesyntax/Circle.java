package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(Colors color, double radius) {
        super(color);
        this.radius = radius;
        this.setInfo("Figure: circle, area: " + this.getArea() + " sq. units, radius: "
                + (int) this.radius + " units, color: " + this.getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
