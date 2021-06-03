package core.basesyntax;

public class Circle extends Shape {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %s, radius: %s, color: %s%n",
                calculateArea(), radius, getColor());
    }
}
