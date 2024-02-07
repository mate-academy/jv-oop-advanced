package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculataArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + calculataArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor());
    }
}
