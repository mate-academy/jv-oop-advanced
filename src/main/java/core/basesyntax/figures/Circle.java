package core.basesyntax.figures;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
        area();
    }

    @Override
    public void area() {
        area = 3.14 * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, " +
                "area: " + area + " sq.units, " +
                "radius: " + radius + " units, " +
                "color: " + color);
    }
}
