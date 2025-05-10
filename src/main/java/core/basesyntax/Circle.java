package core.basesyntax;

public class Circle extends Figure {
    public static final double MAX_RADIUS = 10;

    private final double radius;
    private final TypeFigure name = TypeFigure.CIRCLE;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public TypeFigure getName() {
        return name;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Figure: " + getName().name()
                + " area: " + calculateArea() + " sq.units, radius: "
                + getRadius() + " units, color: " + getColor());
    }
}
