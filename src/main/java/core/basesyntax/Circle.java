package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    Circle(String color, int radius) {
        super("circle", color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + String.format("%.2f", getArea())
                + " sq. units, radius: " + radius + " units, color: " + color + ".");
    }
}
