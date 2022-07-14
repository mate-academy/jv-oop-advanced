package core.basesyntax;

public class Circle extends Figure {

    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void print() {
        System.out.println("Figure: circle, area: "
                + getArea()
                + " sq.units, side: "
                + radius
                + " units, color: "
                + getColor()
        );
    }
}
