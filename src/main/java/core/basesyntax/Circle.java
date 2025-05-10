package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        String string = String.format("Figure: Circle, area: %,.2f sq.units, "
                + "radius: %d units, color: %s", getArea(), radius, getColor());
        System.out.println(string);
    }
}
