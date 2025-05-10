package core.basesyntax.figures;

public class Circle extends Figure {
    private static final String name = "circle";
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: " + name
                + ", area: " + getArea()
                + " sq.units, radius = " + radius
                + " units, color: " + getColor();
    }
}
