package core.basesyntax;

public class Circle extends Figure {
    public static final int RANGE = 10;
    private double radius;

    public Circle() {
        this.radius = Math.random() * RANGE;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: " + String.format("%.1f", getArea())
                + " sq. units, radius: " + String.format("%.1f", radius)
                + " units, color:" + getColor());
    }
}
