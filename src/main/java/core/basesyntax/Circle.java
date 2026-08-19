package core.basesyntax;


public class Circle extends Figure  {


    private final double radius;

    public Circle(final String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw circle with radius " + radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getArea() + " sq. units, radius: " + radius + " units, " + super.toString();
    }
}
