package core.basesyntax;

public class Circle extends BaseFigure {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %.1f sq.units, radius: %d units, color: %s%n",
                getArea(), radius, color.toString().toLowerCase());
    }
}
