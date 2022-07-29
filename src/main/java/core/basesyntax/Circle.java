package core.basesyntax;

public class Circle extends Figure {
    private String color;
    private int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * 2;
    }

    @Override
    public String draw() {
        return "Figure: Circle, color: " + getColor() + ", "
                + "area: " + getArea() + " sq.units, "+
                "radius: " + radius;
    }
}
