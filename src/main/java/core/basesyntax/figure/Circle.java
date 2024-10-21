package core.basesyntax.figure;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return (double) Math.round(area * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, "
                + "area: " + getArea() + " sq. units, "
                + "radius: " + radius + " units");
    }
}
