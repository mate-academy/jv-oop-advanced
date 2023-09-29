package core.basesyntax;

public class RightTriangle extends Figure {
    private int side1;
    private int side2;

    public RightTriangle(Color color, int side1, int side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double findArea() {
        return getSide1() * getSide2() * 0.5;
    }

    @Override
    public void draw() {
        System.out.println(("Figure: rightTriangle, area: " + findArea()
                + " sq.units, side 1: " + getSide1() + " sq.units, side 2: "
                + getSide2() + "units, color: " + getColor()));
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }
}
