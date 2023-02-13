package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color, TypeOfFigure.CIRCLE);
        this.radius = radius;
    }

    public TypeOfFigure getType() {
        return TypeOfFigure.CIRCLE;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getType().name()
                + ", area: " + calculateArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }
}
