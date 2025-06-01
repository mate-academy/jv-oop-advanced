package core.basesyntax;

public class Circle extends ColorFigure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawable: circle, area: " + getArea()
                + ", radius: " + radius
                + ", color: " + getColor());
    }
}
