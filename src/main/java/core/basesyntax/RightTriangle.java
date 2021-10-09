package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstleg, int secondtleg) {
        super(color);
        this.firstLeg = firstleg;
        this.secondLeg = secondtleg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * getFirstLeg() * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area "
                + getArea() + " sq.units," + " first leg: "
                + getFirstLeg() + " units," + " second leg: "
                + getSecondLeg() + " units," + " color: "
                + getColor());
    }
}
