package core.basesyntax;

public class Circle extends Figure {
    public static final double PI = Math.PI;
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + calculateArea() + " sq. units, radius: "
                + radius + " color: " + getColor().toLowerCase());
    }
}
