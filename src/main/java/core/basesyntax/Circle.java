package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super("Circle", color);
        this.radius = radius;
    }

    @Override
    protected double areaCalculation() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return ("Figure: " + getName() + ", areа: " + areaCalculation()
                + " sq. units, radius: " + radius + " units, color: " + getColor());
    }
}
