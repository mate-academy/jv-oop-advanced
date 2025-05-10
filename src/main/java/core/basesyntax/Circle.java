package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + area() + "sq. units, radius: "
                + radius + " units, color: " + getColor());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
