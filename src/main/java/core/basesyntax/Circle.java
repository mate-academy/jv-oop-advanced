package core.basesyntax;

public class Circle extends Figure {
    private static final String name = "circle";
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: " + name
                + ", area: " + df.format(getArea()) + " sq.units"
                + ", radius: " + this.radius
                + ", color: " + getColor().toLowerCase());
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}

