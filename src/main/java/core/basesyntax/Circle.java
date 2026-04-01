package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color,double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle,"
                + " area: " + area()
                + ", color: " + getColor()
                + ", radius: " + radius);
    }

}
