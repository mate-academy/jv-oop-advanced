package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle");
        System.out.println("Area: " + getArea() + " sq. units");
        System.out.println("Radius: " + radius + " units");
        System.out.println("Color: " + getColor());
        System.out.println(" ");
    }
}
