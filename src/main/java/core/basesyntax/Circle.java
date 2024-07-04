package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private double area;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void getArea() {
        area = Math.PI * radius * radius;
    }

    @Override
    public void Paint() {
        System.out.println("Figure: circle, area: "
                + area + " sq. units, radius: "
                + radius + " units, color: "
                + getColor());
    }
}
