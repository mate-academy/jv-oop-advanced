package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
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
