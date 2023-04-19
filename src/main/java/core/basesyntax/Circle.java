package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void printInfo() {
        setArea(Math.PI * Math.pow(radius, 2));
        System.out.println("Figure: circle, area: " + getArea()
                + ", radius: " + radius
                + ", color: " + getColor());
    }
}
