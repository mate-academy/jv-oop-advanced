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
    public String draw() {
        return "Figure: square, area: " + areaCalculator()
                + " sq.units, side: " + this.side
                + " units, color: " + this.getColor();
    }

    @Override
    public int areaCalculator() {
        return this.side * this.side;
    }
}
