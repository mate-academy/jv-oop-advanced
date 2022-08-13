package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(int side, String color) {
        this.side = side;
        this.color = color;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void toDraw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Figure: rightTriangle, area: "
                + Math.sqrt(3) * side * side / 4
                + " sq.units, side: "
                + side
                + " units, color: " + color;
    }
}
