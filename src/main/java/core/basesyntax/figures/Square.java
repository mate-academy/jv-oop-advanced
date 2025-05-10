package core.basesyntax.figures;

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
    public String toString() {
        return "Figure: " + FigureType.SQUARE.name().toLowerCase() + ", area:" + getArea()
                + " sq.units, side: " + side + " units, color: " + getColour();
    }
}
