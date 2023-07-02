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
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: square" + ", " + "area: " + String.format("%.1f",getArea())
                + " sq.units" + ", " + "side: " + side + " units"
                + ", " + "color: " + getColor().toLowerCase();
    }
}
