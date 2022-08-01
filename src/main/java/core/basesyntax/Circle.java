package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle() {
    }

    public Circle(double radius, double area, String color) {
        super(color, area);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("circle, " + "area: " + areaCalculate(super.getArea()) + " sq.units, "
                + "radius: " + radius + " units, " + "color: " + getColor());
    }

    @Override
    public double areaCalculate(double area) {
        return 3.14 * area;
    }
}
