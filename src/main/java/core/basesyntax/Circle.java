package core.basesyntax;

public class Circle extends Figure {
    private String NAME = "Circle";
    private int radius;

    public Circle(Colors color, int radius) {
        super(color);
        this.radius = radius;
    }

    public String getName() {
        return NAME;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea() + " sq. units, radius:  " + getRadius()
                + " units, color: " + getColor());
    }

}
