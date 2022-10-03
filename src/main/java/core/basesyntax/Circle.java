package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;
        setColor(color);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (this.radius * this.radius);
    }

    public String draw() {
        return "Figure: " + FigureName.CIRCLE.name() + " area: " + area()
                + " radius: " + this.radius + " color: " + getColor().name();
    }
}
