package core.basesyntax;

public class Circle extends Figure{
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    private int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: "
                + getArea() + " sq.units, side: "
                + getRadius() + " units, color: "
                + getColor().toLowerCase());
    }
}
