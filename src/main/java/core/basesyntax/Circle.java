package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + String.format("%.2f", calculateArea())
                + " sq.units, radius: "
                + radius
                + " units, color: "
                + getColor().name());
    }
}
