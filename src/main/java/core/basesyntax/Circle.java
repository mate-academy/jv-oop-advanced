package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.print("Figure: circle, area: " + getArea() + "sq. units,");
        System.out.println("radius: " + radius + " units, color: " + getColor());
    }
}
