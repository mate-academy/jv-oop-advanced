package core.basesyntax;

public class Circle extends Figure {
    private double radius;


    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.sqrt(radius) * Math.PI;
    }

    @Override
    void draw() {
        System.out.println(String.format("Figure: circle, area: %.2f sq.units, radius: %.2f units, color: %s"
                , getArea(), radius, getColor()));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
