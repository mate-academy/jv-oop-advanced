package core.basesyntax;

public class Circle extends Shape {

    private double radius;

    Circle(double radius, Colour colour) {
        this.radius = radius;
        this.colour = colour;
    }

    @Override
    public double calculateArea() {
        return radius * 3.14;
    }

    @Override
    public void draw() {
        System.out.println("Circle: radius = " + radius + ", area = "
                + calculateArea() + ", colour - " + colour);
    }
}
