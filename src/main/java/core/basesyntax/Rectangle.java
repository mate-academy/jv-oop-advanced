package core.basesyntax;

public class Rectangle extends Figure {
    double side1;
    double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
        this.square = side1 * side2;
    }
    @Override
    public double getSquare() {
        square = side1 * side2;
        return square;
    }

    @Override
    public void printSquareInfo() {
        System.out.println("Figure: rectangle\narea: " + square + " sq.units\none side: " + side1 + " units\nanother side " + side2 + " units\ncolor: " + color);
    }
}
