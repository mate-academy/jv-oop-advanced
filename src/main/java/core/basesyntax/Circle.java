package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + FigureName.Square.name()
                + ", area: " + getArea()
                + ", sq.units, radius: " + radius
                + ", units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
