package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + Figures.CIRCLE.name() + ", area: "
                + calculateArea() + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor());
    }
}
