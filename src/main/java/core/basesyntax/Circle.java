package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void toDraw() {
        System.out.println("Circle [Color: " + color + ", Radius: "
                + radius + ", Area: " + getArea() + "]");
    }
}
