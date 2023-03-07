package core.basesyntax.model.extended;

import core.basesyntax.model.Figure;
import core.basesyntax.utils.Color;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calcArea() {
        return Math.sqrt(firstLeg) + Math.sqrt(secondLeg);
    }

    @Override
    public void draw() {
        double area = calcArea();
        String colorString = color.toString();

        System.out.printf("Figure: circle, area: %,.2f sq.units, firstLeg: %d units, "
                + "secondLeg: %d units, color: %s%n",
                        area, firstLeg, secondLeg, colorString);
    }
}
