package core.basesyntax;

public class Circle extends Figure {

    private int radius;

    public Circle() {

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + ", radius: " + getRadius()
                + ", color: " + super.getColor());
    }
}
