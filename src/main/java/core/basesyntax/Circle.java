package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private final double pi = 3.14;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * pi;
    }

    @Override
    public void draw() {
        String firstPart = "Figure: circle, area: " + calculateArea() + " sq. units, radius: ";
        String secondPart = radius + " units, color: " + getColor();
        System.out.println(firstPart + secondPart);
    }
}
