package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle() {
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float)(Math.PI * radius * radius);
    }

    @Override
    public String draw() {
        return super.toString() + ", area: " + getArea()
                + " sq.units, radius " + radius + " units";
    }
}
