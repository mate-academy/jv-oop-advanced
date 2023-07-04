package core.basesyntax.figure;

import core.basesyntax.tools.Color;

public class RightTriangle extends Figure {

    private int firstLeg = 0;
    private int secondLeg = 0;
    private double area = 0;

    public RightTriangle(String name, Color color) {
        setName(name);
        setColor(color);
        randomFigure();
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setLegs(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        resultArea();
    }

    @Override
    public void resultArea() {
        setArea((getFirstLeg() * getSecondLeg()) / 2);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" area: " + getArea() + " sq.units"
                + ", firstLeg: " + getFirstLeg() + " units, "
                + "secondLeg: " + getSecondLeg() + " units, "
                + "color: " + getColor().name());
    }

    @Override
    public void randomFigure() {
        setLegs(randomSideFigure(), randomSideFigure());
    }
}
