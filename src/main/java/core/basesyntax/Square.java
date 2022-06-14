package core.basesyntax;

public class Square extends Figure{
    private final int side;

    public Square(int side) {
        super.setColor();
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "Figure: square, " +
                "area: " + getArea() +" sq.units, "+
                "side: " + side + " units, " +
                "color: " + super.getColor().toLowerCase();
    }
}
