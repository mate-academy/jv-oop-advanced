package core.basesyntax;

public class Square extends Figure {
double side;

public Square(double side) {
    this.side = side;
    this.square = side * side;
}
    @Override
    public double getSquare() {
        square = side*side;
        return square;
    }

    @Override
    public void printSquareInfo() {
        System.out.println("Figure: square\narea: " + square + " sq.units\nside: " + side + " units\ncolor: " + color);
    }
}
