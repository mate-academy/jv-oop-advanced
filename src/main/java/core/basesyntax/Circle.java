package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color,double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: Circle, area: "
                            + getArea() + " m^2, radius: "
                            + radius + ", color: "
                            + getColor());
    }
}
