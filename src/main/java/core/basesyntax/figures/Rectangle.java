package core.basesyntax.figures;

public class Rectangle extends Figures {
    private int firstSide;
    private int secondSide;

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                           + " sq.units, first side: " + firstSide
                           + " " + unitOrUnits(firstSide) + ", second side: " + secondSide
                           + " " + unitOrUnits(secondSide) + ", color: " + getColor().getInfo());
    }
}
