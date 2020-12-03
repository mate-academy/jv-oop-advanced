package core.basesyntax;

public class RightTriangle extends Figure {
    private int side1;
    private int side2;

    public RightTriangle(int side1, int side2) {
        setSide1(side1);
        setSide2(side2);
        setColor();
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return Math.round((side1 + side2) / 2);
    }

    public double getHypotenuse() {
        return Math.round(Math.sqrt(side1 * side1 + side2 * side2));
    }

    @Override
    public String draw() {
        return super.draw() + " rightTriangle, "
                + " area: " + getArea()
                + " color: " + getColor()
                + " side1: " + getSide1()
                + " side2: " + getSide2()
                + " hypotenuse: " + getHypotenuse();
    }
}
