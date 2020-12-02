package core.basesyntax;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, Colour colour) {
        super(colour);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * 3.14;
    }

    @Override
    public void draw() {
        System.out.println("Circle: radius = " + radius + ", area = "
                + calculateArea() + ", colour - " + getColour());
    }
}
