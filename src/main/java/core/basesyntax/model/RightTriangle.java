package core.basesyntax.model;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.type = FigureType.RIGHT_TRIANGLE;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        double result = firstLeg * secondLeg / 2.0;
        return result;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getNameByType()
                + ", area: " + getArea() + " sq.units, first_Leg: "
                + firstLeg + ", second_Leg: " + secondLeg + ", color: " + getStringColor());
    }
}
