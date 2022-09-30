package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double area() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public Figure drawState() {
        System.out.println("Name = " + getName() + " Area = " + area()
                + " First side = " + firstLeg + " Second side = "
                + secondLeg + " Color = " + getColor());
        return null;
    }
}
