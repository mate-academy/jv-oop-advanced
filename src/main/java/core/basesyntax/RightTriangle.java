package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {

        return Math.sqrt(3) / 4 * side * side;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rightTriangle, area: " + getArea()
                        + " sq.units, " + "side: " + side
                        + " units, color: " + super.getColor());
    }
}
