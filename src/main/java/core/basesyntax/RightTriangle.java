package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideOne;
    private int sideTwo;

    public RightTriangle(int sideOne, int sideTwo, Colors colors) {
        super(colors);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double getArea() {
        return ((sideOne * sideTwo) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, "
                + "area: "
                + getArea()
                + ", side_one: "
                + sideOne
                + ", side_two: "
                + sideTwo
                + ", color: "
                + getColor());
    }
}
