package core.basesyntax;

public class RightTriangle extends Figure {
    private int legA;
    private int legB;

    public RightTriangle(int legA, int legB, Color color) {
        super(color);
        this.legA = legA;
        this.legB = legB;
    }

    @Override
    public double getArea() {
        return (legA * legB) / 2;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: RightTriangle, Area: " + getArea() + " sq. units, LegA: " + legA
                + ", + LegB: " + legB + " units, Color: " + getColor());
    }
}
