package core.basesyntax;

public class Square extends Figure {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: "
                + getArea()
                + " sq. units, side: "
                + side
                + " units, color: "
                + getColor();
    }

    @Override
    public double getArea() {
        return side * side;
    }

}
