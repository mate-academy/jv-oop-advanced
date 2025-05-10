package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super.setColor(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, "
                + "area:" + calculateArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + super.getColor();
    }
}
