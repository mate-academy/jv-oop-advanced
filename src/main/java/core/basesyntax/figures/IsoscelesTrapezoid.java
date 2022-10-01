package core.basesyntax.figures;

import core.basesyntax.FiguresClass;

public class IsoscelesTrapezoid extends FiguresClass {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(String color,int firstSide, int secondSide,int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double areaCalculator() {
        return (firstSide + secondSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area:"
                + this.areaCalculator()
                + " sq.units, height: " + this.getHeight()
                + " firstSide: " + this.firstSide + " units, secondSide: "
                + this.secondSide + " units, color: " + this.getColor());
    }
}

