package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) { // it was Color -> String
        super(color);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: " + getArea()
                + " sq. units, color: " + getColor()
                + ", radius: " + getRadius());
    }
}
