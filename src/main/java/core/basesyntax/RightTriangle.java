package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return this.firstLeg * this.secondLeg / 2;
    }

    @Override
    public String print() {
        return "Figure: right triangle, area:"
                + calculateArea()
                + " sq.units , firstLeg: "
                + this.firstLeg
                + " units, secondLeg: "
                + this.secondLeg
                + " units, color: "
                + this.getColor();
    }
}
