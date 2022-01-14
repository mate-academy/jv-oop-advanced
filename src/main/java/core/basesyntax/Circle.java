package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public String getFig() {
        return "circle";
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
    public String toDraw() {
        return "Figure: " + getFig() + ", area: " + getArea() + " sq.units, radius: "
                + getRadius() + " units, color: " + getColor();
    }
}
