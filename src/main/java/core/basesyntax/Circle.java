package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        setColor(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + getArea() + "sq. units, radius: " + radius
                + ", color: " + getColor() + ".");
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
