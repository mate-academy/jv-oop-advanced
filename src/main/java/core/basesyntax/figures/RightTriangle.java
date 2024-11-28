package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateSquare() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + calculateSquare()
                + " sq. units, firstLeg: " + firstLeg
                + " sq. units, secondLeg: " + secondLeg
                + " units, color: " + color;
    }
}
