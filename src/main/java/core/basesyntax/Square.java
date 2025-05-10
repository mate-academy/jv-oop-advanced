package core.basesyntax;

public class Square extends Figure {
    private int side;

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: "
                + side + " color: " + getColor());
    }
}
