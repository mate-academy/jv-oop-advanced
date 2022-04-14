package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
        setSquare(side * side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void printSquareInfo() {
        System.out.println("Figure: square\narea: " + getSquare() + " sq.units\nside: "
                + side + " units\ncolor: " + getColor());
    }
}
