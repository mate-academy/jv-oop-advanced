package core.basesyntax;

public class Circle extends Figure implements CalculateArea {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void drawArea() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: "
                + getRadius() + " units, color: " + getColor());
    }
}
