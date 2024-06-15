package core.basesyntax;

public class Circle extends Figure {
    private static final String OUTPUT_CIRCLE = "Figure: circle, "
            + "area: %.2f sq. units, "
            + "radius: %.2f units, "
            + "color: %s";
    private double radius;
    private double area;

    public Circle() {
    }

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
        this.area = calculateArea();
    }

    @Override
    public void draw() {
        System.out.println(String.format(OUTPUT_CIRCLE, this.area, this.radius, this.color));
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.area = calculateArea();
    }
}
