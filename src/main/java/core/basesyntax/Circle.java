package core.basesyntax;

public class Circle extends Figure {
    private final int radius;
    private String color;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: " + radius
                + " units, color: " + color);
    }
}
