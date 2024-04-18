package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("This is a circle with area: "
                + getArea() + ". It's radius is: " + radius + ". It's color is " + color);
    }
}
