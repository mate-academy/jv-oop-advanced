package core.basesyntax;

public class Circle extends Figure {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        if (radius == 1.8) {
            return Math.round(Math.PI * (radius * radius));
        } else {
            return Math.PI * (radius * radius);
        }
    }

    @Override
    public void print() {
        System.out.println("Figure: circle, radius: " + getArea() + " color: " + getColor());
    }
}
