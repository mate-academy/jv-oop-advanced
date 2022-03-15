package core.basesyntax.model;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, Color color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public String getAreaReport() {
        return "Figure: " + name
               + ", area = " + getArea() + "sq.units";
    }

    @Override
    public String toString() {
        return "Figure: " + name
               + ", area: " + getArea()
               + " sq.units, radius: " + radius
               + " units, color: " + color;
    }
}
