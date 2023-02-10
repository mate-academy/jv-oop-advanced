package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String drawFigure() {
        return "Figure: triangle, area: " + calculateArea()
                + " sq.units, firstLeg: " + getFirstLeg()
                + " units, secondLeg: " + getSecondLeg()
                + " units, color: " + getColor();
    }
}
