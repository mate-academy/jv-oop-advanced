package core.basesyntax.entity.figure;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: circle, area: %.2f sq.units, color: %s, radius: %d units.",
                getArea(), super.getColor(), radius));
    }
}
