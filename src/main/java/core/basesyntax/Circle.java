package core.basesyntax;

public class Circle implements Figure {
    private double radius;
    private String color;

    public Circle(double side, String color) {
        this.radius = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: "
                + radius + " units, color: " + color);
    }
}
