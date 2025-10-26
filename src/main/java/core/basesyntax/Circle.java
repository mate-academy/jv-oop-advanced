package core.basesyntax;

public class Circle extends Figure {
    private final String name = FigureName.CIRCLE.name().toLowerCase();
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + " area: " + getArea()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor());
    }
}
