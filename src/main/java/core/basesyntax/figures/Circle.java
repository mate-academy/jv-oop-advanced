package core.basesyntax.figures;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Figure: " + "circle, "
                + "area: " + String.format("%,.1f", calculateArea()) + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + color.toLowerCase()
        );
    }
}
