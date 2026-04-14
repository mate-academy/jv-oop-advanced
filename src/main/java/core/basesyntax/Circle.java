package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color, FigureType.CIRCLE);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + getFigureType().name().toLowerCase()
                + ", area: " + calculateArea() + " sq. units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor());
    }
}
