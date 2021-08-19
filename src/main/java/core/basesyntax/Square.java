package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (double) side * side;
    }

    @Override
    public String drawer() {
        return "Figure: square, area: " + (int) (Math.random() * getArea())
                + " sq.units, side: " + side + " units, color: " + getColor();
    }
}
