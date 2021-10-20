package core.basesyntax;

public class RightTriangle extends Figure implements Drowable {
    private int height;
    private int side;

    public RightTriangle(Color color, int height, int side) {
        super(color);
        this.height = height;
        this.side = side;
    }

    @Override
    public void drow() {
        System.out.println("Name: " + getClass().getSimpleName()
                + " Color: " + this.getColor()
                + " Hypotenyse: " + height + " units."
                + " Side: " + side + " units."
                + " Area: " + getArea() + " sq.units.");
    }

    @Override
    public double getArea() {
        return 0.5 * (height + side);
    }
}
