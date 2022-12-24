package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle," + "  area: " + gerArea() + " units," + " radius: "
                + getRadius() + " units," + " color: " + getColor());
    }

    @Override
    public double gerArea() {
        return getRadius() * getRadius() * Math.PI;
    }
}
