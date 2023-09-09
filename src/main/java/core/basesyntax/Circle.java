package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int area() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public int perimeter() {
        return (int) (Math.PI * radius * 2);
    }

    @Override
    public String toString() {
        return super.toString() + ", radius: " + radius + ", color: " + getColor();
    }
}
