package core.basesyntax;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw the circle");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape: circle, area: "
                + getArea()
                + " sq. units, radius: "
                + radius
                + " units, color: "
                + color;
    }
}
