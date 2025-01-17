package core.basesyntax.figures;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (double) Math.round(Math.PI * radius * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + getArea() + " sq. units, radius: " + radius
                + " units, color: " + color);
    }
}
