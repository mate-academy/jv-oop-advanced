package core.basesyntax;

public class Circle extends Figure {
    private double area;
    private double diameter;
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

    public double diameterCalculator() {
        return diameter = radius * 2;
    }

    public double areaCalculator() {
        return area = 3.14 * (radius * radius);
    }

    @Override
    public String draw() {
        return "Figure: circle, area: " + getArea() + " sq. units, radius: "
                + getRadius() + " units, diameter: "
                + getDiameter() + " units, color: "
                + getColor();
    }
}
