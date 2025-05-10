package core.basesyntax;

public class Square extends Figure {
    private int side;

    @Override
    public String drawArea() {
        return "Figure: square, "
                + "area: " + side * side + " sq. units, "
                + "side: " + side + " units, "
                + "color: " + getColor()
                + '}';
    }

    public void setSide(int side) {
        this.side = side;
    }
}
