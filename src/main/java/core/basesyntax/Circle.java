package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.PI * radius * radius * 100) / 100;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: circle, area: " + calculateArea() + " sq.units, radius: "
                + radius + " units, color " + getColor());
    }
}
