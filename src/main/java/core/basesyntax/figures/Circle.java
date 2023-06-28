package core.basesyntax.figures;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
        super.area = getArea();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Figure: " + "circle, "
                + "area: " + String.format("%,.1f", area) + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + color.toLowerCase()
        );
    }
}
