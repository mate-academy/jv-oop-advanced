package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * radius;
    }

    @Override
    public String draw() {
        return "figure: circle, area: "
                + getArea() + " sq.units, radius: "
                + radius + " units, color: "
                + getColor().toString().toLowerCase();
    }
}
