package core.basesyntax.figures;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, "
                                                    + "radius: " + radius + " units, "
                                                    + "color: " + color);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
