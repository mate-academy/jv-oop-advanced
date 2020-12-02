package core.basesyntax;

public class IsoscelesTrapezoid extends Shape {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height, Colour colour) {
        super(colour);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (sideA + sideB) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Trapezoid: sides = " + sideA + " and " + sideB + ", height = "
                + height + ", area = " + calculateArea() + ", colour - " + getColour());
    }
}
