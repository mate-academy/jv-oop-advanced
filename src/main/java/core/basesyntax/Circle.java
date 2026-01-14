package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, Colors color) {
        this.radius = radius;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void print() {
        System.out.println(
                "Figure: Circle, "
                        + "area: " + getArea() + " sq. units, "
                        + "radius: " + radius + " units, "
                        + "color: " + getColor().name());
    }
}
