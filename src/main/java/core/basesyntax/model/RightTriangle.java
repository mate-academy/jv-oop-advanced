package core.basesyntax.model;

import core.basesyntax.model.enums.Color;

public class RightTriangle extends Figure {

    private Integer firstLeg;
    private Integer secondLeg;

    public RightTriangle(Color color, Integer firstLeg, Integer secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public Double calculateArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: "
                + calculateArea() + " sq. units, firstLeg: "
                + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
