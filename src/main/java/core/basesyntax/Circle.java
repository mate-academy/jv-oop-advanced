package core.basesyntax;

public class Circle extends ColoredFigure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %.2f sq.units, radius: %.2f units, color: %s\n",
                getArea(), radius, getColor());
    }
}
