package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
        setType(FigureType.CIRCLE);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure:"
                + getType()
                + ", area: " + getArea() + " sq.units,"
                + " radius: " + radius + " units,"
                + " color: " + getColor());
    }
}
