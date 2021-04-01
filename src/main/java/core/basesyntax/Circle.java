package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + this.getArea() + " sq. units, radius: " + this.radius
                + " units, color: " + this.getColor();
    }
}
