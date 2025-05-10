package core.basesyntax.model;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + String.format("%.1f", calculateArea())
                + " sq.units, radius: " + radius
                + " units, color: " + this.getColor());
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
