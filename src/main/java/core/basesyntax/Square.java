package core.basesyntax;

public class Square extends Figure {

    private int side;

    public Square(int side, Color color) {

        super(color);
        this.side = side;

    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: Square, Area: " + getArea() + " sq. units, Side: " + side
                + " units, Color: " + getColor());
    }
}
