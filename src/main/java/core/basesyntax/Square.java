package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: square, area: " + calculateArea()
                + " square units, side: " + side + " units , color: " + getColor());
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}
