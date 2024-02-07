package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle"
                + ", area: " + calculateArea() + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
