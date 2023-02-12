package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double area;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColor(color);
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void drawTheInformation() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + " sq.units, first leg: " + firstLeg + "units, second leg: " + firstLeg
                + "units, color: " + getColor());
    }
}
