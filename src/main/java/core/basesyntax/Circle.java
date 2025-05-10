package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double obtainArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Figure: " + "circle,"
                + " area: " + obtainArea() + " sq.units,"
                + " radius: " + radius + " units,"
                + " color: " + super.getColor().toLowerCase();
    }
}
