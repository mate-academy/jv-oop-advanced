package core.basesyntax.figures;

import core.basesyntax.FiguresClass;

public class RightTriangle extends FiguresClass {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color,int firstLeg,int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double areaCalculator() {

        return Math.sqrt(3 / 4 * this.getFirstLeg());
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area:"
                + this.areaCalculator()
                + " sq.units, firstLeg: "
                + this.getFirstLeg() + " secondLeg: "
                + this.getSecondLeg() + " units, color: "
                + this.getColor());
    }
}

