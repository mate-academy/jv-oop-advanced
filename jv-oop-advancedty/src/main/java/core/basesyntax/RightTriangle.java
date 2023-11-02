package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg,double secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        double result = (firstLeg * firstLeg) + (secondLeg * secondLeg);
        return Math.sqrt(result);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right rectangle, area: " + calculateArea()
                + "sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg
                + "units, color: " + color);
    }
}
