package core.basesyntax;

public class Circle implements Figure {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getDraw() {
        return "This is Circle. I have Area: " + getArea() + "; radius: " + radius + "; and have color: " + getColor();
    }
}
