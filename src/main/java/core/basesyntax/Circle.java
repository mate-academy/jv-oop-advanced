package core.basesyntax;

public class Circle extends FigCol implements Figure{
    private double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: " + radius + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
