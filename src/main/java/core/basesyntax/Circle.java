package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    @Override
    public void draw() {
        System.out.println("Figure: circle, area:" + this.getArea()
                + " sq.units, radius: " + radius + " units, color: " + this.getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
