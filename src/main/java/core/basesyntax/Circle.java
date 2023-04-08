package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    private String color;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double) Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: circle, area: " + getArea()
                        + "sq.units, radius " + radius
                        + " units, color: " + getColor()
        );
    }
}
