package core.basesyntax;

public class Circle implements Figure {
    double PI = 3.1415;
    double radius;
    Color color;

    Circle(double radius, Color color) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color.name().toLowerCase();
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public String display() {
        return "Figure: " + getName() + ", area: " + getArea() + "units, side: " + radius + " units, color: " + getColor();
    }
}
