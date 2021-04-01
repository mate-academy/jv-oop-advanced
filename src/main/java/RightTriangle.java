import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color, "right triangle");
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: " + getArea() + " sq. units"
                    + ", firstLeg: " + firstLeg + ", secondLeg: " + secondLeg
                    + " units, color: " + getColor();
    }
}

