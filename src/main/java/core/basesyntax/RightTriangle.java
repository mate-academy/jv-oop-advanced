package core.basesyntax;

public class RightTriangle implements Figura {
    private final double firstLeg;
    private final double secondLeg;
    private final String color;
    public RightTriangle(double firstLeg, double secondLeg,String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    public double getFirstLeg() {
        return this.firstLeg;
    }

    public String getColor() {
        return this.color;
    }

    public double getSecondLeg () {
        return secondLeg;
    }
    @Override
    public String toString() {
        return "Figure : right thiangle, "
                + "area: " + getArea()
                + " sq. units, firstLeg = "
                + firstLeg + ", secondLeg = "
                + secondLeg
                + " units, color: '"
                + color + "'";
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
