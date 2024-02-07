package core.basesyntax;

public class Circle extends Figures {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: " + radius
                + " units, color: " + color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
