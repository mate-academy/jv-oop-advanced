package core.basesyntax;

public class Circle extends Figure {
    static final double PI = 3.14;
    private int radius;

    public Circle() {

    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor());
    }
}
