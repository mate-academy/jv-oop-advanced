package core.basesyntax;

public class RightTriangle extends Figure {
    private int height;
    private int side;

    public RightTriangle(String color, int height, int side) {
        super(color);
        this.height = height;
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Name: " + getClass().getSimpleName()
                + ", Color: " + getColor()
                + ", Hypotenyse: " + height + " units."
                + ", Side: " + side + " units."
                + ", Area: " + getArea() + " sq.units.");
    }

    @Override
    public double getArea() {
        return 0.5 * (height + side);
    }
}
