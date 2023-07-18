package core.basesyntax;

public class Circle extends AbstractAreaCalculator {
    private int radius;
    private String color;

    public Circle(String color, int radius) {
        super(color);
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle - Color: " + color + ", Radius: "
                + radius + ", Area: " + getArea());
    }
}
