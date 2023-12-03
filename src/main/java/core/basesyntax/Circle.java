package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("I am circle, my area is " + calculateArea()
                + " my radius is " + radius
                + ", my color is " + getColor() + "\n");
    }
}
