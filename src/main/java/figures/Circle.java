package figures;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
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
    public void draw() {
        System.out.printf("Figure: circle, area: %4.2f sq.units"
                + ", radius: %2d units"
                + ", color: %s%n", getArea(), getRadius(), getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
