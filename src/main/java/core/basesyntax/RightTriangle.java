package core.basesyntax;

import abstracts.Figure;
import enums.Color;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return this.firstLeg;
    }

    public double getSecondLeg() {
        return this.secondLeg;
    }

    @Override
    public double getArea() {
        return getFirstLeg() * getSecondLeg() / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: "
                + this.getArea()
                + " sq. units, "
                + "firstLeg: "
                + this.getFirstLeg()
                + " units, "
                + "secondLeg: "
                + this.getSecondLeg()
                + " units, color: "
                + this.getColor());
    }
}
