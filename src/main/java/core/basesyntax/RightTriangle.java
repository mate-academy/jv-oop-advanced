package core.basesyntax;

public class RightTriangle extends Figure {
    private int oneSide;
    private int secondSide;

    public RightTriangle(String color, int oneSide, int secondSide) {
        super(color);
        this.oneSide = oneSide;
        this.secondSide = secondSide;
        calcArea();
    }

    @Override
    public void calcArea() {
        setArea((double) (oneSide * secondSide) / 2);
    }

    @Override
    public String toString() {
        return "Figure: rightTriangle, area: " + getArea() + " sq. units, oneside: "
                + oneSide + " units," + " secondSide: " + secondSide + " units,"
                + " color: " + getColor();
    }
}
