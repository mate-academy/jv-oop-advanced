package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double obtaining() {
        return side * side;
    }

    @Override
    public void print() {
        System.out.println("Figure: Rectangle , area: " + obtaining()
                + " sq. units,  firstLeg: " + side
                + " units, color: " + getColor());
    }
}
