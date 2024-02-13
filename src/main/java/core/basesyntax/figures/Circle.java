package core.basesyntax.figures;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw(Figure circle) {
        System.out.println("Figure: circle, area: " + getArea(circle) + " sq. units, "
                                                    + "radius: " + radius + " units, "
                                                    + "color: " + circle.color);
    }

    @Override
    public double getArea(Figure circle) {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
