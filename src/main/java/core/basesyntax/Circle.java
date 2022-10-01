package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double eadius) {
        super(color);
        this.radius = eadius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor());
    }
}
