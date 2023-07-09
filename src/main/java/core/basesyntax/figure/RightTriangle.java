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
        return ((this.firstLeg * this.secondLeg) / 2);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" area: " + resultArea() + " sq.units"
                + ", firstLeg: " + this.firstLeg + " units, "
                + "secondLeg: " + this.secondLeg + " units, "
                + "color: " + getColor().name());
    }
}
