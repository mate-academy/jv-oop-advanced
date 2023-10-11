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
    public String draw() {
        return "Figure: circle, area: " + areaCalculator()
                + " sq.units, radius: " + this.radius
                + " units, color: " + this.color;
    }

    @Override
    public int areaCalculator() {
        return (int)Math.PI * this.radius * this.radius;
    }
}
