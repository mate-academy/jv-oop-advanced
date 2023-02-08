package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        this.radius = radius;
        this.setColor(color);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printInformation() {
        System.out.println("Figure: circle, area: " + area() + " sq.units, radius: "
                + radius
                + " units, color: "
                + getColor().name());
    }
}
