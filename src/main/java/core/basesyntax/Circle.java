package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color, String name) {
        this.radius = radius;
        super.setColor(color);
        super.setName(name);
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getName()
                + ", area: " + getArea()
                + " sq.units, radius: " + getRadius()
                + ", color: " + getColor());
    }
}
