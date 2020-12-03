package core.basesyntax;

public class RightTriangle extends Figure {

    private double firstLeg;
    private double secondLeg;

    public void setLegs(double firstLeg, double secondLeg) {
        if (firstLeg <= 0 || secondLeg <= 0) {
            firstLeg = 3;
            secondLeg = 4;
        }
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
    public void calculateArea() {
        this.area = 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: rectangle, area: " + area + " sq. units, hypotenuse: "
                + calculateHypotenuse() + " units, color: " + getColor());
    }

    public double calculateHypotenuse() {
        return Math.sqrt(firstLeg * firstLeg + secondLeg * secondLeg);
    }
}
