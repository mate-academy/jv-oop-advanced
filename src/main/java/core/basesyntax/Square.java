package core.basesyntax;

public class Square extends Figures {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: "
                + getArea() + " sq. units, side: "
                + side + " units, color: "
                + getColor());
    }
}
