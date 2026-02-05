package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + this.getArea()
                + " sq. units, first leg: " + this.firstLeg
                + " units, second leg: " + this.secondLeg
                + " units, color: " + this.getColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2.0;
    }
}
