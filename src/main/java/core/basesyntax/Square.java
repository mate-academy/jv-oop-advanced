package core.basesyntax;

public class Square extends Figure {

    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String info() {
        return "Figure: square, area: "
                + area()
                + " sq. units, side: "
                + side
                + " units, color: "
                + getColor();
    }

    @Override
    public double area() {
        return side * side;
    }
}
