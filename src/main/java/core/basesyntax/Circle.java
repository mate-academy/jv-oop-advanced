package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
        this.area = calculateArea();
    }

    public String draw() {
        return "Figure: circle, "
                + "area: " + area + " sq.units "
                + "radius: " + radius + " units "
                + "color: " + color.name().toLowerCase();
    }

    @Override
    public double calculateArea() {
        return (int)(Math.PI * radius * radius * 1000) / 1000.0;
    }
}
