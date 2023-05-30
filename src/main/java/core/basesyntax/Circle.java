package core.basesyntax;

public class Circle implements Figure {
    private int radius;
    private Color color;

    public Circle(int radius, Color color) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Circle area = " + getArea() + ", color: "
                + color.name() + ", radius: " + radius);
    }
}
