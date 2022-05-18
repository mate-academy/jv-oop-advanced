package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void showInfo() {
        System.out.println("Figure: Square, area: " + firstLeg * secondLeg + " sq.units,"
                + " first leg: " + firstLeg
                + " units, second leg: " + secondLeg + " units, color: " + color);
    }
}
