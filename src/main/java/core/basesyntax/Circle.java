package core.basesyntax;

public class Circle extends Figure {

    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = 3.14 * radius * radius;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "IsoscelesTrapezoid, "
                + "area: " + getArea() + " sq.units, "
                + "radius: " + radius + "units, "
                + "color: " + getColor());

    }
}
