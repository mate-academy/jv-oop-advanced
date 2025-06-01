package core.basesyntax;

public class Circle implements Figure {
    private  String color;
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawable: circle, area: " + getArea()
                + ", radius: " + radius
                + ", color: " + color);
    }
}
