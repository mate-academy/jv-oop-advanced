package core.basesyntax;

public class Circle extends FigureBase {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: circle, area: %.2f sq. units, radius: %.2f units, color: %s",
                getArea(), radius, color
        ));

    }
}
