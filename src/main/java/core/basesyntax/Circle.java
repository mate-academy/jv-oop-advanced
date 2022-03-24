package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(FigureType figureType, double radius, Color color) {
        super(figureType, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getFigureType()
                + ", area: " + getArea() + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + super.getColor());
    }
}
