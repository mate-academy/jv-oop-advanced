package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color,double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, " + " radius: " + radius + ", color " + getColor()
                            + ", Circle Area " + getArea());
    }
}
