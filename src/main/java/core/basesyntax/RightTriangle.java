package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (getFirstLeg() * getSecondLeg()) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle" + ", color: "
                +
                getColor() + ", first leg: " + getFirstLeg()
                +
                ", second leg: " + getSecondLeg() + ", area: " + getArea());
    }
}
