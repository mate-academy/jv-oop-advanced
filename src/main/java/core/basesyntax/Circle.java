package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("I am circle, my area is " + getArea()
                + " my radius is " + radius
                + ", my color is " + getColor() + "\n");
    }
}
