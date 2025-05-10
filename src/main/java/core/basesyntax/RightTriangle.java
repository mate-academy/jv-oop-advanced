package core.basesyntax;

public class RightTriangle extends Figure {
    private int legA;
    private int legB;

    public RightTriangle(int legA, int legB, String color) {
        this.legA = legA;
        this.legB = legB;
        setColor(color);
    }

    public void setLegA(int legA) {
        this.legA = legA;
    }

    public void setLegB(int legB) {
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
        return 0.5 * legA * legB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, leg A: "
                + getLegA() + " units, leg B: " + getLegB() + " units, color: " + getColor());
    }
}
