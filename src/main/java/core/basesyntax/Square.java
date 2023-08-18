package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String colour, double side) {
        super(colour);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, first side: "
                + side + " units, colour: " + getColour());
    }
}
