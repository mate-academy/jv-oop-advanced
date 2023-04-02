package core.basesyntax;

public class Circle extends Figure {
    private static final String NAME = "circle";
    private int radius;
    private double area;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + NAME + ", area: " + getArea()
                + " sq.units, radius: " + radius + " units," + " color: " + color);
    }
}
