package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = 3.14;

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public void displayProperty() {
        System.out.println("Figure: circle, color: " + super.getColor() + ", size of the radius: "
                + radius + ", area: " + calculateArea());
    }
}
