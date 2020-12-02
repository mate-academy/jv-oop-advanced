package core.basesyntax;

public class Circle extends Figure {
    private String name = "Circle";
    private int radius;

    public Circle(Colors color, int radius) {
        super(color);
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea() + " sq. units, radius:  " + getRadius()
                + " units, color: " + getColor());
    }

}
