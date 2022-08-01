package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea() + " units, "
                + "FirstSide: " + firstSide + " units, "
                + "SecondSide: " + secondSide + " units, "
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
