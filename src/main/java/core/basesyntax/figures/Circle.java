package core.basesyntax.figures;

public class Circle extends Figure {

    private static final String OUTPUT_CIRCLE = "Figure: circle, "
            + "area: %.2f sq. units, "
            + "radius: %.2f units, "
            + "color: %s";

    private double radius;

    public Circle() {

    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format(OUTPUT_CIRCLE, this.area, this.radius, getColor()));
    }

    @Override
    public double calculateArea() {
        this.area = radius * radius * Math.PI;
        return area;
    }
}
