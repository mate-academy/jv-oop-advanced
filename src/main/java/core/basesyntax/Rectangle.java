package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    public int secondSide;

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double getAreaFigure() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getAreaFigure()
                + " sq.units, firstSide: " + firstSide + " units, secondSide: "
                + secondSide + " units, color: " + getColor());
    }
}