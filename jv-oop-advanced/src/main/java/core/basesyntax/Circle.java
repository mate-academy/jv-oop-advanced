package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: " + this.getArea()
        + " sq. units, radius: " + radius + " units, color: " + getColor());
    }
}
