package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.pow(Math.PI * radius, 2);
    }

    @Override
    public void print() {
        System.out.println("Circle: " + getColor() + " radius "
                + radius + " area " + area());
    }
}
