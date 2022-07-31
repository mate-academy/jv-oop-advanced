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

    public double area() {
        return Math.pow(radius,2) * Math.PI;
    }

    @Override

    public String information() {
        return "figure: circle" + " radius: " + radius + " units area: "
                + area() + " sq.units" + " color: " + color;
    }
}
