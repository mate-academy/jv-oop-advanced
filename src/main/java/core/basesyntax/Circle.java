package core.basesyntax;

public class Circle extends Figure {
    private final double radius;
    private final String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: Circle" + ", Color: " + color + ", area: " + getArea());
    }
}
