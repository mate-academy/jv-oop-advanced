package core.basesyntax.figures;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %1$.2f sq.units, "
                        + "radius: %2$d units, color: %3$s%n",
                this.getArea(), radius, this.getColor());
    }
}
