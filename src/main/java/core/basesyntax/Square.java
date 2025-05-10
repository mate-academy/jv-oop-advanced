package core.basesyntax;

public class Square extends Figure {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        String information = String.format("Figure: square, area: %,.2f sq.units, "
                        + "%d units, color: %s",
                        getArea(), side, getColor());
        System.out.println(information);
    }
}
