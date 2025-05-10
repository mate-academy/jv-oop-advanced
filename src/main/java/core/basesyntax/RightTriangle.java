package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getLegA() {
        return firstLeg;
    }

    public void setLegA(int legA) {
        this.firstLeg = legA;
    }

    public int getLegB() {
        return secondLeg;
    }

    public void setLegB(int legB) {
        this.secondLeg = legB;
    }

    @Override
    public double getArea() {
        return ((double) firstLeg * secondLeg) / 2;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: " + getArea()
                + " sq.units, firstLeg: " + firstLeg + " units, secondLeg "
                + secondLeg + " units, color: " + getColor();
    }
}
