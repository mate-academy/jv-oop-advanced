package core.basesyntax;

public class Square extends Shape {
    private double side;

    Square(double side, Colour colour) {
        this.side = side;
        this.colour = colour;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square: side = " + side + ", area = "
                + calculateArea() + ", colour - " + colour);
    }
}
