package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super("Circle", color);
        this.radius = radius;
    }

    public Circle() {

    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getType() + " area: " + getArea() + " sq.units, "
                + "radius: " + radius + " units, color: " + super.getColor());

    }

}
