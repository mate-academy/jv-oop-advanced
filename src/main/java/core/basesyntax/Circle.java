package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
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
    public double calculateArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public String draw() {
        return "Figure: " + FigureName.CIRCLE.name() + " area: " + calculateArea()
                + " radius: " + this.radius + " color: " + getColor().name();
    }
}
