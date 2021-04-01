package core.basesyntax;

public class RightTriangle extends Figure {
    private int side_one;
    private int side_two;

    public RightTriangle(int side_one, int side_two, Colors colors) {
        super(colors);
        this.side_one = side_one;
        this.side_two = side_two;
    }

    @Override
    public double getArea() {
        return ((side_one * side_two) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, " + "area: " + getArea() + ", side_one: " + side_one + ", side_two: " + side_two + ", color: " + getColor());
    }
}
