package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + area() + " units, radius: " + radius
                + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return (double) (Math.PI * radius * radius);
    }
}
