package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }


    @Override
    public String draw() {
        return "Figure: " + Figures.CIRCLE.name() + ", area: "
                + calculateArea() + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor();
    }
}
