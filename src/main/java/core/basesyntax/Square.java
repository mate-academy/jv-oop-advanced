package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public double findArea() {
        return side * side;
    }

    public String draw() {
        return "Figure: square, " + "area: " + String.format("%.1f",findArea())
                + " sq.units, side: " + side
                + " units, color: " + getColor();
    }
}
