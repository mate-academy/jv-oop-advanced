package core.basesyntax;

public class Circle implements Figure {
    private Color color;
    private double radius;

    public Circle(Color color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: " + radius + " units, color: " + getColor());
    }

    @Override
    public Color getColor() {
        return color;
    }
}
