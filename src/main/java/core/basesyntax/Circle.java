package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + (Math.PI * radius * radius) + " sq.units, radius: "
                + radius + " units, color: " + new ColorSupplier().getRandomColor();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle was drawn");
    }
}
