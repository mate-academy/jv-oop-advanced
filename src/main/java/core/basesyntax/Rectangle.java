package core.basesyntax;

public class Rectangle extends Figure {
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
                + " sq.units, first side: " + firstSide + " units, second side: " + secondSide
                + " units, color: " + getColor());
    }
}

