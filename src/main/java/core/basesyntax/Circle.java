package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius,Color color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public void drow() {
        System.out.println("Figure: circle"
                + ", area: "
                + getArea()
                + " sq.units"
                + ", radius: "
                + radius
                + " units, color: "
                + getColor().name().toLowerCase());
    }
}
