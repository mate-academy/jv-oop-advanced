package core.basesyntax.figure;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String getPrint() {
        return "Figure: right triangle, area: " + calculateArea() + "sq. units, "
                + " firstLeg: " + firstLeg + " units, "
                + " secondLeg: " + secondLeg + " units, " + "color: " + getColor();
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
