package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("RightTriangle = {" + "color: " + getColor()
                + ", firstLeg: " + getFirstLeg()
                + ", secondLeg: " + getSecondLeg()
                + ", area: " + getArea() + "}");
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
