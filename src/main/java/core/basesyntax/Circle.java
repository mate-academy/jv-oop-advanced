package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = Math.PI;
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    public String draw() {
        return "Figure: Circle, Area: "
                + getArea()
                + " units, Radius: "
                + radius
                + " units, "
                + " Figure Color "
                + getColor();
    }

}
