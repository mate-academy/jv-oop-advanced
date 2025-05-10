package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return ((firstLeg * secondLeg) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle color: " + getColor()
                + " area: " + getArea() + " sq.units "
                + " firstLeg: "
                + firstLeg + " secondLeg: "
                + secondLeg);
    }
}
