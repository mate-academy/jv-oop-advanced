package core.basesyntax.figures;

import core.basesyntax.constants.ColorName;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(ColorName color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateFigureArea() {
        return (double) firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", first leg: " + firstLeg
                + ", second leg: " + secondLeg
                + ", area: " + calculateFigureArea()
                + ".");
    }
}
