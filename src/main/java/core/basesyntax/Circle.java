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

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: circle, area: " + String.format("%.1f", getArea())
                + " sq.units, radius: " + radius + ", color: " + getColor().toLowerCase());
    }
}
