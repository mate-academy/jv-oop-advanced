package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
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
}
