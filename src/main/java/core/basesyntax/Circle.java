package core.basesyntax;

public class Circle implements Figure {
    private double radius;
    private Color color;

    public String figureInfo() {
        return "Figure : Circle, Area :" + getArea() + " Radius: " + radius + " Color: " + color;
    }
    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
