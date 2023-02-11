package core.basesyntax;

public class Circle extends Figure {
    private final double radius;
    private final TypeOfFigure type = TypeOfFigure.CIRCLE;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public TypeOfFigure getType() {
        return type;
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
                    + " sq.units, radius: " + getRadius()
                    + " units, color: " + getColor());
    }
}
