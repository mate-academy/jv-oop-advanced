package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double result = Math.PI * Math.pow(radius, 2);
        double scale = Math.pow(10, 1);
        return Math.ceil(result * scale) / scale;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + getArea() + " sq.units, radius: "
                + radius + " units, color: "
                + getColor());
    }
}
