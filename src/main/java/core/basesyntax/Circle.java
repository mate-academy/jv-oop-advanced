package core.basesyntax;

public class Circle extends Figure {
    private double radius;

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
    public String toDraw() {
        return "Figure: " + getFigureType() + ", area: " + getArea() + " sq.units, radius: "
                + getRadius() + " units, color: " + getColor();
    }
}
