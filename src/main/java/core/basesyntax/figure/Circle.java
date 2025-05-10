package core.basesyntax.figure;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        String color = getColor().name().toLowerCase();
        String info = "Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius
                + " units, color: " + color;
        System.out.println(info);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
