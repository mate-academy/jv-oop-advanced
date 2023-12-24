package core.basesyntax.figures;

public class Circle extends Shape {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
        area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle,"
                + " area: " + calculateArea() + " sq. units,"
                + " radius: " + radius + " units,"
                + " color: " + color + "\"");
    }
}
