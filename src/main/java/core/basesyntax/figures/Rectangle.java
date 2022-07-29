package core.basesyntax.figures;

import core.basesyntax.temp.Figure;

public class Rectangle extends Figure {

    private double firstSide;
    private double secondSide;
    private double figureArea;

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public void getArea() {
        figureArea = firstSide * secondSide;
    }

    @Override
    public void draw() {
        getArea();
        System.out.println("Rectangle, area: " + figureArea + ", first side: " + firstSide
                + ", second side: " + secondSide + ", color: " + getColor());
    }
}
