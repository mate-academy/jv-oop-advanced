package core.basesyntax;

public class Circle extends Figure implements Shape {
    private int radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    void draw() {
        System.out.println("I am " + color.toString().toLowerCase()
                + " circle, my radius is " + radius
                + " and my area is " + String.format("%.2f", getArea()));
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
