package core.basesyntax;

public class Square implements CountArea {
    private int side;

    public Square (int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: square, "
        + "area: " + Math.floor(getArea()) + " sq.units, "
        + "side: " + side + " units, "
        + "color: " + color.toString().toLowerCase());
    }
}
