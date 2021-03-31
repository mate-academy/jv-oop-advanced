package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color, String property) {
        super(color, property);
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
                + getProperty() + ": " + radius
                + " units, color: " + getColor()
                + '}';
    }
}
