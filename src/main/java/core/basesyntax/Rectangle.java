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
    public double obtainArea() {
        return getFirstSide() * getSecondSide();
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + obtainArea() + " sq. units, first side: "
                + getFirstSide() + " units, second side: "
                + getSecondSide() + " units, color:"
                + getColor());
    }
}
