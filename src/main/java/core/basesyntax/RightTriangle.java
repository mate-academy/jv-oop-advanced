package core.basesyntax;

public class RightTriangle extends Shape {
    private double base;
    private double height;

    RightTriangle(double base, double height, Colour colour) {
        this.base = base;
        this.height = height;
        this.colour = colour;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Right triangle: base = " + base + ", height = "
                + height + ", area = " + calculateArea() + ", colour - " + colour);
    }
}
