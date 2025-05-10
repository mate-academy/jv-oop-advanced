package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure circle: color " + getColor()
                + ", area = " + calculateArea() + ", radius = " + radius + " units");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
