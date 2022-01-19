package core.basesyntax;

public class Square extends Figure {
    private int side;

    Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public String print() {
        return "Figure: square, area: "
                + " sq.units, side: "
                + this.side
                + " units, color: "
                + this.getColor();
    }
}
