package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle\n"
                + "area: " + findArea() + "sq.units\n"
                + "radius: " + radius + "units\n"
                + "color: " + getColor());
    }

    @Override
    public double findArea() {
        return radius * Math.pow(Math.PI, 2);
    }
}
