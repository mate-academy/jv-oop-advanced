package core.basesyntax.figures;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        super.color = color;
        super.area = findArea();
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + super.area
                + " sq.units, radius: " + this.radius
                + " units, color: " + super.color);
    }

    @Override
    protected double findArea() {
        double unformattedArea = Math.PI * radius * radius;
        return Math.round(unformattedArea * 1000.0) / 1000.0;
    }
}
