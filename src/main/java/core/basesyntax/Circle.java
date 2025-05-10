package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius,Color color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius,2);
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
