package core.basesyntax.figure;

public class Circle extends AbstractFigure {
    private int radius;

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
        System.out.printf("Figure: circle, area: %.2f sq.units, radius: %d units, color: %s%n",
                getArea(), radius, getColor().toLowerCase());
    }
}
