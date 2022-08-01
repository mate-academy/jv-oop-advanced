package core.basesyntax.figure;

public class Circle extends Figure {
    private double radius;

    public Circle() {
        super();
    }

    public Circle(String figureType, String color, double radius) {
        super(figureType, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureType()
                + ", area: " + getArea() + " sq.units,"
                + " radius: " + radius
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * getRadius() * getRadius());
    }
}
