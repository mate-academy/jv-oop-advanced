package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * radius;
    }

    public String draw() {
        return "Figure: circle, " + "area: " + String.format("%.1f",findArea())
                + " sq.units, radius: " + radius
                + " units, color: " + getColor();
    }
}
