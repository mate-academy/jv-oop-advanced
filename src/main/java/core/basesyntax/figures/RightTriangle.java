package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, String name, int firstLeg, int secondLeg) {
        super(color, name);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String getInfo() {
        return super.getInfo()
                + " firstLeg: "
                + firstLeg
                + " units"
                + " secondLeg: "
                + secondLeg
                + " units";
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
