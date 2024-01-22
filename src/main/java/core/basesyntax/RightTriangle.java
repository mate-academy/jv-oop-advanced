package core.basesyntax;

public class RightTriangle extends Figure {
    public static final int DIVIDER_TRIANGLE = 2;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg,double secondLeg, String color) {
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
    public double calculateArea() {
        return (getFirstLeg() * getSecondLeg()) / DIVIDER_TRIANGLE;
    }

    @Override
    public void drawable() {
        System.out.println("Figure: Right triangle, first leg " + getFirstLeg()
                + " units, second leg " + getSecondLeg() + " units + area: "
                + calculateArea() + " sq. units, color " + getColor());
    }
}
