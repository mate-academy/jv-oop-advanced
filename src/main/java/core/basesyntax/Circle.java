package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private double area;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void paint() {
        System.out.println("Figure: circle, area: "
                + getArea() + " sq. units, radius: "
                + radius + " units, color: "
                + getColor());
    }
}
