package core.basesyntax;

public class Circle implements FigureMethods {
    private int radius;
    private Color color;

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: " + radius + " units, color: " + color);
    }
}
