
package core.basesyntax;

public class Circle extends Figure {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getAreaCalculator() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getDrawable() {
        return "Figure : circle, area " + getAreaCalculator() + " sq.units, radius: "
                + radius + " units, color: " + getColor();
    }
}
