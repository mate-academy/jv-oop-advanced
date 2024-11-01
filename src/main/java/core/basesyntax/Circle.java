package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, String name, int radius) {
        super(color, name);
        this.radius = radius;
    }

    @Override
    public int calculateArea() {
        return (int) (radius * radius * Math.PI);

    }

    @Override
    public String toString() {
        return "Figure:"
                + "name: "
                + super.getName()
                + ", "
                + "area: "
                + calculateArea()
                + " sq. units, "
                + "radius: "
                + radius
                + ", "
                + "color: "
                + super.getColor();
    }
}
