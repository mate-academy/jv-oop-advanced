package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        this.radius = radius;
        setColor(Colors.valueOf(color));
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius
                + ", color: " + getColor().name().toLowerCase());
    }
}
