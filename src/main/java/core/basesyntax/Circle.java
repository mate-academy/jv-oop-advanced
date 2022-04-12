package core.basesyntax;

public class Circle extends Figure implements CanObtainArea, CanDraw {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getArea() + " sq.units, "
                + "radius: " + getRadius() + " units, "
                + "color: " + getColor();
    }
}
