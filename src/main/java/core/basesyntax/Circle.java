package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
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
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        String info = "Figure: circle";
        info += ", area: " + getArea();
        info += " sq.units, radius: " + radius;
        info += " units, color: " + getColor().name();
        System.out.println(info);
    }
}
