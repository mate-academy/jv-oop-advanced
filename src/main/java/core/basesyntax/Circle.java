package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = Math.PI;
    private int radius;

    public Circle(String color, int radius) {
        super(Color.valueOf(color));
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + getArea()
                + " sq. units"
                + ", radius: "
                + radius
                + " units"
                + ", color: "
                + getColor().name());
    }
}
