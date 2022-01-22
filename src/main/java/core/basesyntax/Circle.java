package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, Drawable {
    private double radius;
    private String color;

    public Circle(String color, double radius) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColor() {
        ColorSupplier colorSupplier = new ColorSupplier();
        color = colorSupplier.getRandomColor();
        return color;
    }

    @Override
    public String draw() {
        return "Figure: circle. Radius: " + radius
                + "mm. Area: " + getArea() + " sq.mm. Color: " + color;
    }
}
