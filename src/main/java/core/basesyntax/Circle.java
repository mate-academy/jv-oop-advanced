package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String draw() {
        return "Figure{Circle , area: "
                + String.format("%.1f", calculateArea()) + " sq. units, "
                + "radius: " + radius
                + " units, color: " + getColor()
                + '}';
    }
}
