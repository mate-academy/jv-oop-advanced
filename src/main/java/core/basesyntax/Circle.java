package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + FigureName.CIRCLE.name()
                + ", area: " + getArea()
                + ", sq.units, radius: " + radius
                + ", units, color: " + getColor().name());
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
