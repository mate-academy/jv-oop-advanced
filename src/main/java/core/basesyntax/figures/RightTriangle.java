package core.basesyntax.figures;

import core.basesyntax.Color;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;
    private String name = "Right Triangle";

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea()
                + "sq.units, first leg: " + firstLeg + ", second leg: "
                + secondLeg + ", color: " + getColor());
    }
}
