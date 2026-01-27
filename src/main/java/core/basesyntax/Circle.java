package core.basesyntax;

public class Circle extends AbstractFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + getArea()
                + ", radius: "
                + radius
                + ", color: "
                + getColor());
    }
}
