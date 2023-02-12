package core.basesyntax;

public class Circle extends Figure {
    private final int radius;
    private final TypeFigure name = TypeFigure.CIRCLE;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public TypeFigure getName() {
        return name;
    }

    @Override
    public double calculateArea() {
        return (int) Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Figure: " + getName().name()
                + " area: " + calculateArea() + " sq.units, radius: "
                + getRadius() + " units, color: " + getColor());
    }
}
