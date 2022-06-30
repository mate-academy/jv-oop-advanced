package core.basesyntax;

public class Square extends State {
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
        System.out.println("Figure: Square "
                + ", area: "
                + getArea()
                + " sq.units"
                + ", side: "
                + side
                + " units"
                + ", color: "
                + getColor());
    }
}
