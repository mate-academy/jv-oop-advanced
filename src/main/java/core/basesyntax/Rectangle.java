package core.basesyntax;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, Colour colour) {
        super(colour);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: sides " + sideA + " and " + sideB + ", area = "
                + calculateArea() + ", colour - " + getColour());
    }
}
