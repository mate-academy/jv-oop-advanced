package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, firstSide: " + firstSide + " sq. units, secondSide: "
                + secondSide + " color: " + getColor());
    }
}

