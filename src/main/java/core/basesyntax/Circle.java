package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, FigureDrawer {
    private double circleRadius;

    public Circle(double circleRadius, String color) {
        super(color);
        this.circleRadius = circleRadius;
    }

    public double getCircleRadius() {
        return circleRadius;
    }

    @Override
    public double getArea() {
        return Math.PI * (circleRadius * circleRadius);
    }

    @Override
    public String draw() {
        return "Figure: circle, area: "
                + Math.round(getArea())
                + " sq. units, radius: "
                + Math.round(getCircleRadius())
                + " units, color: " + getColor();
    }
}

