package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.setColor(color);
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
        double area;
        area = this.radius * this.radius * Math.PI;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + String.format("%.1f", this.getArea())
                + " sq.units, radius: " + String.format("%.1f", radius)
                + " units, color: " + this.getColor());
    }
}
