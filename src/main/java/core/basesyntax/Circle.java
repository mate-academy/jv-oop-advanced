package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.centimeters, radius: "
                + getRadius() + ", color: " + getColor());
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }
}
