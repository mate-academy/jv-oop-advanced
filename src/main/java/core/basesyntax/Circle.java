package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getcalcutateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getcalcutateArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor());
    }
}


