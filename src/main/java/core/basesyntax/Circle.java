package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: %s, area: %s sq.units, radius: %d units, color: %s",
                getClass().getSimpleName(), getArea(), radius, getColor()));
    }
}
