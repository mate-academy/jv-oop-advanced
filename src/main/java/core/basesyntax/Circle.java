package core.basesyntax;

public class Circle extends Figures {
    private int radius;

    public Circle(String color, int radius) {
        super(color, "Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq. units, radius: "
                + radius + ", color: " + getColor());
    }
}
