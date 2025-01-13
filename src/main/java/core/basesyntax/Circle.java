package core.basesyntax;

public class Circle extends Figure implements DrawTheFigure, ObtainTheArea {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void drawTheFigure() {
        System.out.println("Figure: circle, area: " + obtainTheArea() + ", color: " + color + ", radius: " + radius);
    }

    @Override
    public double obtainTheArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
