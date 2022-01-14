package core.basesyntax;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.round(Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + area() + " sq.units, radius: " + radius + ", color: " + getColor());
        //System.out.printf("%.3f", area());
    }
}
