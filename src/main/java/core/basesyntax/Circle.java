package core.basesyntax;

public class Circle extends Figures {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + area()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor());
    }
}
