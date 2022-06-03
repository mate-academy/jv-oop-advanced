package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(int side) {
        this.side = side;
    }

    @Override
    public double getSquare() {
        return side * side * ((Math.sqrt(3)) / 4);
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: right triangle, area: " + getSquare()
                + " sq.units , side " + side + " units, color: " + getColor());
    }
}
