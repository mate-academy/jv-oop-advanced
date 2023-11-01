package core.basesyntax;

public class Square extends Figure {

    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String info() {
        double area = side * side;
        return "Figure: square, area: "
                + area
                + " sq. units, side: "
                + side
                + " units, color: "
                + getColor();
    }
}
