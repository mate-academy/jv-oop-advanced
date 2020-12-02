package core.basesyntax;

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    Rectangle(double sideA, double sideB, Colour colour) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.colour = colour;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: sides " + sideA + " and " + sideB + ", area = "
                + calculateArea() + ", colour - " + colour);
    }
}
