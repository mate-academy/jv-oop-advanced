package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getClass().getSimpleName()
                + ", Area: " + getSquare()
                + ", radius " + getRadius()
                + ", Color: " + getColor());
    }
}
