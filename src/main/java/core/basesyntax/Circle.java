package core.basesyntax;

public class Circle extends Figure {

    private double radius;

    Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
        setArea((Math.pow(radius,2) * Math.PI));
    }

    @Override
    public String draw() {
        return "Shape: circle, area: " + getArea() + " sq. units"
                + " radius: " + getRadius() + " units, "
                + "color: " + getColor();
    }

    public double getRadius() {
        return radius;
    }
}
