package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public String figureInfo() {
        return "Figure : Circle, Area :" + getArea() + " Radius: " + radius + " Color: " + color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
