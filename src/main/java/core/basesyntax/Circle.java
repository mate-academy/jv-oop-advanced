package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(Color.valueOf(color));
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getFormattedArea() {
        return Math.floor(getArea() * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + getFormattedArea()
                + " sq.units, radius: "
                + radius
                + " units, color: "
                + getColor().name().toLowerCase());
    }
}
