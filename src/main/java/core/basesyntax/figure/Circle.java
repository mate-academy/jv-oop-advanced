package core.basesyntax.figure;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        String color = getColor().name().toLowerCase();
        return "Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius
                + " units, color: " + color;
    }
}
