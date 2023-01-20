package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: Circle {" + "radius: " + radius + " units"
                + ", color: " + getColor() + ", area: " + getArea() + " sq.units" + '}');
    }
}
