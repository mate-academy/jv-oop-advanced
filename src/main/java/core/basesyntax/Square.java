package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, Colour colour) {
        super(colour);
        this.side = side;
    }

    public double getDiagonal() {
        return Math.sqrt(2 * side);
    }

    public double getSide() {
        return side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return String.format("RightTriangle: side: %.2f units, perimeter: %.2f units,"
                        + " area: %.2f units, color: %s, diagonal: %.2f units, Hypotenuse: %.2f.",
                side, getPerimeter(), getArea(),
                getColour(), getDiagonal());
    }
}
