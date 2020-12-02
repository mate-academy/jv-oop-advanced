package core.basesyntax;

public class Square extends Shape {
    private double side;

    public Square(double side, Colour colour) {
        super(colour);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square: side = " + side + ", area = "
                + calculateArea() + ", colour - " + getColour());
    }
}
