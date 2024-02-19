package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return "Figure: circle, "
                + "area: "
                + getArea()
                + " sq. units, "
                + "radius: "
                + radius
                + " units, "
                + "color: "
                + getColor();
    }
}
