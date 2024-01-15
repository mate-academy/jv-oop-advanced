package core.basesyntax.figures;

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
    public void draw() {
        System.out.print("\nType: right triangle"
                + "\nFirst leg: " + firstLeg
                + "\nSecond leg: " + secondLeg
                + "\n Area: " + getArea()
                + "\nColor: " + getColor()
                + "\n-----------");
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

}
