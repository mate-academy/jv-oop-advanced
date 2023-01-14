package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = getRandom().nextInt(Max_Value);
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius: " + radius + " units" +
                ", color: " + getColor() +
                ", area: " + getArea() + " sq.units" +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
