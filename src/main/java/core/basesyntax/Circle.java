package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawable() {
        System.out.printf("Figure: Circle, area: %.1f sq.units, radius: %.1f units, color: %s\n",
                getArea(), radius, super.getColor());
    }
}
