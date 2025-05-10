package core.basesyntax;

public class Square extends Figure {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double obtainArea() {
        return getSide() * 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + obtainArea() + " sq. units, side: "
                + getSide() + " units, color:"
                + getColor());
    }
}
