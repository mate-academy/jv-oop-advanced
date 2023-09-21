package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super.setColor(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public static Circle createCircle(double radius, String color) {
        return new Circle(radius, color);
    }

    @Override
    public void getArea() {
        double area = (Math.PI * radius * radius);
        System.out.println("Figure: circle, area: " + decimalFormat.format(area)
                + " sq.units, radius: " + decimalFormat.format(radius)
                + " units, color: " + getColor());
    }
}
