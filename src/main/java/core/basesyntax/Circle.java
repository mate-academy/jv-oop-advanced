package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle() {
    }

    public Circle(double radius, Color color) {
        this.radius = radius;
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return (double) (Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, "
                + "area: " + getArea() + " sq.units, "
                + "radius: " + radius + "units "
                + "color: " + getColor());
    }
}
