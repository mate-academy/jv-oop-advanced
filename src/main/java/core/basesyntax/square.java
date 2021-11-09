package core.basesyntax;

public class square extends Figural {
    private int side;

    public square (String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + getArea()
                + " sq. units, side: "
                + side
                + " units, color: "
                + getColor());

    }

    @Override
    public double getArea() {
        return side * side;
    }

}
