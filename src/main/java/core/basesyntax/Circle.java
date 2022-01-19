package core.basesyntax;

public class Circle extends Figure implements FigureProperties {
    private double radius;
    private String color;

    public Circle(String color, double radius) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure: circle. Radius: " + radius +
                "mm. Area: " + getArea() + " sq.mm. Color: " + color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
