package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private String randomColor = new ColorSupplier().getRandomColor();

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + (Math.PI * radius * radius) + " sq.units, radius: "
                + radius + " units, color: " + randomColor;
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
