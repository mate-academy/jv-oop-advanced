package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    public Square() {
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + String.format("%.1f", calculateArea())
                + " sq.units, side: " + side
                + " units, color: " + getColor();
    }
}
