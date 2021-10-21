package core.basesyntax;

public class Circle extends Figure implements StateOfFigures {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println( "Figure: circle, area: " + getArea() + " sq.units,"
                + " radius: " + radius + " units,"
                + " color: " + getColor());
    }
}
