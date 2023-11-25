package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideOne;
    private int sideTwo;

    public RightTriangle(Color color, int sideOne, int sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double findArea() {
        return sideOne * sideTwo * 0.5;
    }

    @Override
    public void draw() {
        System.out.println(("Figure: rightTriangle, area: " + findArea()
                + " sq.units, side 1: " + sideOne + " sq.units, side 2: "
                + sideTwo + "units, color: " + getColor()));
    }
}
