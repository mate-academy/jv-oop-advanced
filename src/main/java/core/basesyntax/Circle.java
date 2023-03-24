package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getData() {
        data = "Figure: circle, area: " + area + " sq.units, radius: " + radius
               + " units, color: " + color;
        return data;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
