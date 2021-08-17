package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printInfoFigure() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units,"
                + " radius: " + getRadius() + "units,"
                + " color: " + getColor());
    }
}
