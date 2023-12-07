package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Circle:");
    }

    @Override
    public String toString() {
        return "Color: " + getColor()
                + ", radius: " + radius + ", Area: " + getArea();
    }
}
