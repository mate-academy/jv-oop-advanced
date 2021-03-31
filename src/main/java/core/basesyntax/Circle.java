package core.basesyntax;

public class Circle extends Figures {
    private final String name = "circle";
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: " + name + "," + " area:" + getArea()
                + " sq. units, radius length: " + radius + " units, color: " + getColor());
    }

    @Override
    public String toString() {
        return "Circle{"
                + "name='" + name + '\''
                + ", radius=" + radius
                + ", color='" + getColor() + '\''
                + '}';
    }
}

