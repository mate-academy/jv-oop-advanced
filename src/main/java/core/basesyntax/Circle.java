package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: circle, area: " + getArea() + "sq.units, radius: " + radius
                + "units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
