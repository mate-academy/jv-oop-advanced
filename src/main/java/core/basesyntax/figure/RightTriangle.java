package core.basesyntax.figure;

import core.basesyntax.tools.Color;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String name, Color color, int firstLeg, int secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double resultArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" area: " + resultArea() + " sq.units"
                + ", firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units, "
                + "color: " + getColor().name());
    }
}
