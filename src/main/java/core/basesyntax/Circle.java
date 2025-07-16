package core.basesyntax;

public class Circle extends Figure {

    private String color;
    private int radius;

    public Circle(String color, int radius) throws Exception {
        this.color = color;
        if (radius <= ZERO) {
            throw new Exception("Radius is less than one");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: "
                + "circle, "
                + "area: " + getArea() + " sq. units, "
                + "radius: " + radius + " units, "
                + "color: " + color;
    }
}
