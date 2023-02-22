package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle"
                + ", area =  " + getArea()
                + " sq.units" + ", radius = "
                + radius + " units"
                + ", color = " + getColor());
    }

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }
}
