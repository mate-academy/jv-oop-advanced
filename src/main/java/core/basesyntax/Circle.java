package core.basesyntax;

public class Circle extends Shape implements Figure {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void draw() {
        System.out.println("Draw the circle");
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "square, area: "
                + getArea()
                + " sq. units, radius: "
                + radius
                + " units, color: "
                + color;
    }
}
