package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + " square units, first leg: " + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + getColor());
    }

    @Override
    double calculateArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
