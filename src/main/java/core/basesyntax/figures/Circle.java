package core.basesyntax.figures;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double obtainArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + obtainArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }
}
