package core.basesyntax;

public class Rectangle extends Figure implements GetArea, Draw {

    private double firstLeg;
    private double secondLeg;
    private double area = firstLeg * secondLeg;

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
    public double area() {
        return area;
    }

    @Override
    public void print() {
        System.out.println("Figure: Rectangle, area: " + area() + " sq. units, " + "FirstLeg: " + firstLeg + ", SecondLeg: " + secondLeg + ", Color: " + getColor());
    }
}
