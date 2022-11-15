package core.basesyntax;

public class Circle extends ColorFigure implements Figure {//s = PI*r*r;
    private double radius;

    public Circle(String color) {
        super(color);
    }

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
        System.out.println("Figure: Circle, area: " + getArea() + " sq.units, "
                + " radius: " + radius + " color: " + getColor());
    }
}
