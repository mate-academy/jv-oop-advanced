package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {

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
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: circle" + ", " + "area: " + String.format("%.1f",getArea()) + " sq.units" + ", " + "radius: " + radius + " units"
                + ", " + "color: " + getColor().toLowerCase();
    }
}

