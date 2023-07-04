package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Circle; area : " + getArea() + " sq.units, "
                + " radius : " + radius + " units, "
                + " color : " + getColor().name());
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
