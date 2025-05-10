package core.basesyntax;

public class RightTriangle extends Figure {
    private int legA;
    private int legB;

    public RightTriangle(int legA, int legB, Color color) {
        super(color);
        this.legA = legA;
        this.legB = legB;
    }

    public int getLegA() {
        return legA;
    }

    public int getLegB() {
        return legB;
    }

    @Override
    public double getArea() {
        return legA * legB / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Right triangle, area: "
                + getArea()
                + " sq.units, legA: "
                + getLegA()
                + ", legB: "
                + getLegB()
                + " units, color: "
                + getColor());
    }
}
