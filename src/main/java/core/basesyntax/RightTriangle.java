package core.basesyntax;

public class RightTriangle extends Figure {
    private int oneSide;
    private int secondSide;

    public RightTriangle(Color color, int oneSide, int secondSide) {
        super(color);
        this.oneSide = oneSide;
        this.secondSide = secondSide;
        calcArea();
    }

    @Override
    public String draw() {
        return "Figure: rightTriangle, area: " + getArea() + " sq. units,"
                + " oneSide: " + oneSide + " units,"
                + " secondSide: " + secondSide + " units,"
                + " color: " + getColor();
    }

    @Override
    public void calcArea() {
        setArea((double) (oneSide * secondSide) / 2);
    }
}
