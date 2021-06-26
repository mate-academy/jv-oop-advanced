package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg, double thirdLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return (getFirstLeg() * getSecondLeg()) / 2;
    }

    @Override
    public String draw() {
        System.out.println(("Figure: RightTriangle, area: " + getArea()
                + " sq.units, size firstLeg: " + getFirstLeg()
                + " sq.units, size secondLeg: " + getSecondLeg()
                + " units, color: " + getColor()));
        return null;
    }
}
