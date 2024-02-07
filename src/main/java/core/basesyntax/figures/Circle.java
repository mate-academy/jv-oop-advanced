package core.basesyntax.figures;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return (double) Math.round(area * 100) / 10;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor().toLowerCase());
    }
}
