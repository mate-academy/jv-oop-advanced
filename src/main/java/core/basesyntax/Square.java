package core.basesyntax;

public class Square extends Figure {
    private double side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getcalcutateArea() + " sq.units, side: "
                + side + " units, color: " + getColor());

    }

    @Override
    public double getcalcutateArea() {
        return side * side;
    }
}
