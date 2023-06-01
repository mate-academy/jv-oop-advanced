package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double findArea() {
        return side * side;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: square, area: "
                + this.findArea() + " sq.units, side: "
                + this.side + " units, color: " + this.getColor());
    }
}
