package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + String.format("%.2f", getArea())
                + " sq. units, radius: " + radius
                + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
