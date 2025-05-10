package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle"
                + ", area: "
                + calculateArea()
                + " sq.units"
                + ", radius: "
                + radius
                + " units, color: "
                + getColor().name().toLowerCase());
    }
}
