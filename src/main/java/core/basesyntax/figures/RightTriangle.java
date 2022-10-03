package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String colour, double firstLeg, double secondLeg) {
        super(colour);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String toString() {
        return "Figure: " + FigureType.RIGHT_TRIANGLE.name().toLowerCase()
                + ", area:" + getArea()
                + " sq.units, first leg: " + firstLeg + " , second leg: "
                + secondLeg + " units, color: " + getColour();
    }
}
