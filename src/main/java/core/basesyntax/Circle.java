package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double areaCount(int radius) {
        return Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + areaCount(getRadius()) + " sq.units, radius: " + radius
                + " units, color: " + getColor();
    }

}
