package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    @Override
    public String drawArea() {
        return "Figure: circle, "
                + "area: " + Math.PI * Math.pow(radius, 2) + " sq. units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor()
                + '}';
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
