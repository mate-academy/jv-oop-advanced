package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String figureProperty, String color, double radius) {
        super(figureProperty, color);
        this.radius = radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getFigureProperty() + ", area: "
                + getParameters() + " sq. units, radius: "
                + getRadius() + " units, color: " + getColor());
    }

    @Override
    public double getParameters() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
