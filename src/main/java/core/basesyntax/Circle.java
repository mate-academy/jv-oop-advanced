package core.basesyntax;

public class Circle extends Figures {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + area() + " sq.units, radius: "
                + radius + " units, color: " + getColor());
    }
}
