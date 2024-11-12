package core.basesyntax;

public class Circle extends Figure implements GetFigureArea {
    private double radius = 5;

    @Override
    public String toString() {
        return "Figure - circle: radius " + this.radius
                + " ,area " + this.getArea() + " color "
                + this.color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
}
