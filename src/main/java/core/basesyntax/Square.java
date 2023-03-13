package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public Square() {
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public void draw() {
        System.out.println("Figure: square, area: " + String.format("%.1f", getArea())
                + " sq.units, side: "
                + side + "  units, color: " + super.getColor());
    }

}
