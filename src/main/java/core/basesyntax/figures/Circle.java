package core.basesyntax.figures;

import static core.basesyntax.utils.NumberRounder.round;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super("circle", color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getInfo() {
        return super.getInfo()
                + ", radius: " + round(radius) + " units";
    }
}
