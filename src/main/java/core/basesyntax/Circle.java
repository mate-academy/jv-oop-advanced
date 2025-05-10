package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    private String color;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + getArea() + " sq.units, radius: " + radius
                + " units, color: " + color);
    }
}
