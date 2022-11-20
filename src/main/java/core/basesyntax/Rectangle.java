package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

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

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units, first side: " + getFirstSide()
                + " units, second side: " + getSecondSide() + " units, color: "
                + getColor());
    }
}
