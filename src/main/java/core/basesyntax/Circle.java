package core.basesyntax;

public class Circle extends Figure implements Area {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius * 10.0) / 10.0;
    }

    @Override
    public String draw() {
        return "Figure: circle, area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor();
    }
}
