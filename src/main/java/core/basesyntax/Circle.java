package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: circle, area: %s sq.units, "
                        + "radius: %s units, color: %s",
                this.getArea(), this.radius, this.getColor()));
    }
}
