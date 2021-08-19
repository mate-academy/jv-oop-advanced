package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.format("Figure: circle, area: %f, radius: %d, color: %s",
                getArea(), getRadius(), getColor());
    }
}
