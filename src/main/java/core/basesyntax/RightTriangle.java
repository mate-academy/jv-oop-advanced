package core.basesyntax;

public class RightTriangle extends Shape {
    private double base;
    private double height;

    public RightTriangle(double base, double height, Colour colour) {
        super(colour);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Right triangle: base = " + base + ", height = "
                + height + ", area = " + calculateArea() + ", colour - " + getColour());
    }
}
