package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("I am " + getColor()
                + " circle, my radius is " + radius
                + " and my area is " + String.format("%.2f", getArea()));
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
